//#Question_1:


//main
package com.employee;

public class Main {

    public static void main(String[] args) {
        employee[] office = new employee[5];

        //objects
        for(int i=0;i<6;i++){
            office[i]= new employee();
        }
        //getting details
        for(int i=0;i<5;i++){
            office.getdetails();
        }
        for(int i=0; i<5; i++){
            office.displaydetails();
        }



    }

    }
}

//employee details

import java.util.Scanner;
public class employee {
    public void class office(String[] Args) {
        Scanner ss = new Scanner(System.in);
        String name;
        int age;
        String power;
        String weapon;
        String planet;
        public void  getdetails(){
            System.out.println("enter the name of employee ");
            name = ss.nextLine();
            System.out.println("enter the age of the employee");
            age = ss.nextInt();
            System.out.println("name the salary of the employee");
            power = ss.nextLine();
            System.out.println("name the designation of employee");
            weapon = ss.nextLine();

        }
        public void displaydetails(){
            System.out.println("Hello" + name + "you are " + age + "you have ability of " + power);
            System.out.println("your weapon is " + weapon + "you are from " + planet);
        }
}



//#Question_3

class Main{
   public static void main(String args[]){
     //create array of employee object  
     Employee[] obj = new Employee[2] ;
 
     //create actual employee object
     obj[0] = new Employee();
     obj[1] = new Employee();
     obj[2] = new Employee();
 
     //assign data to employee objects
     obj[0].setData(100,"Alpha");
     obj[1].setData(200,"Beta");
     obj[2].setData(300,"Omega");
 
     //display the employee object data
     System.out.println("Employee Object 1:");
     obj[0].showData();
     System.out.println("Employee Object 2:");
     obj[1].showData();
     System.out.println("Employee Object 3:");
     obj[2].showData();
  }
}
//Employee class with empId and name as attributes
class Employee{
    int empId;
    String name;
    public void setData(intc,String d){
        empId=c;
        name=d;
     }
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}




//#Question_4

class Main{
   public static void main(String args[]){
     //create array of employee object  
     Employee[] obj = new Employee[2] ;
 
     //create actual employee object
     obj[0] = new Employee();
     obj[1] = new Employee();
     obj[2] = new Employee();
 
     //assign data to employee objects
     obj[0].setData(100,"ABC");
     obj[1].setData(200,"XYZ");
     obj[2].setData(300,"123");
 
     //display the employee object data
     System.out.println("Employee Object 1:");
     obj[0].showData();
     System.out.println("Employee Object 2:");
     obj[1].showData();
     System.out.println("Employee Object 3:");
     obj[2].showData();
  }
}
//Employee class with empId and name as attributes
class Employee{
    int empId;
    String name;
    public void setData(intc,String d){
        empId=c;
        name=d;
     }
    public void showData(){
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}

