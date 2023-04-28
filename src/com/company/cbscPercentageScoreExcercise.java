package com.company;

import java.util.Scanner;

public class cbscPercentageScoreExcercise {
    public static void main(String[] args) {
      Scanner  sc =new Scanner(System.in);
       System.out.print("enter the hindi marks :");
        float a= sc.nextFloat();
        System.out.print("enter the english marks :");
      float b= sc.nextFloat();
        System.out.print("enter the maths marks :");
        float c= sc.nextFloat();
        System.out.print("enter the science marks :");
        float d= sc.nextFloat();
        System.out.print("enter the physics marks :");
        float e= sc.nextFloat();
        float cgpa= (a+b+c+d+e)/50;
        System.out.println(cgpa);

        //write a string
      //  System.out.println("Enter your name :" );
        //Scanner sc= new Scanner(System.in);
       // String name  = sc.nextLine();
       //System.out.println( "Hello " +name  +  " have a good day.");
//search interger or not
     /*   System.out.println("Enter your number :" );
       Scanner sc= new Scanner(System.in);
        System.out.println(sc.hasNextInt());*/

//        Scanner sc= new Scanner(System.in);
        
    }
}


