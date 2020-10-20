//main

package com.quiz;

public class Main {

    public static void main(String[] args) {
        Game game=new Game();
        game.initGame();
        game.play();



    }
}




//Player


package com.quiz;
import java.util.Scanner;
public class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){

        System.out.println("Enter player name");
        name=sc.next();

    }

}



//Question


package com.quiz;
import java.util.Scanner;
public class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("please choose an option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
        return false;
    }
}


//game


package com.quiz;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Which is the highest mountain?","Who is the fastest man in the world","Who is the president of india"};
    String[] options1={"Mt.Fuzi","M.S.Dhoni","Pranab Mukherjee"};
    String[] options2={"Mt.kilimanzaro","Usain bolt","Narendra Modi"};
    String[] options3={"Mt.Everest"," Felix","Manmohan Singh"};
    String[] options4={"Mt.k2","Srinivas Gowda","Ram Nath Kovind"};
    int[] answers={3,2,4};


    public void initGame()
    {

        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }


        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Bahot hi unda khele hai aap!!");
                player.score=player.score+5;
            }
            else{
                System.out.println("Maaf karna mai aapki sahyata nahi kar sakta");
                player.score=player.score-5;
            }
        }

        System.out.println(player.name+" your score is "+player.score);

    }
}
