package com.company;

import java.util.Scanner;

public class CWH_05_takingInput {
    public static void main(String[] args) {
       System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
       /* System.out.print("Enter the number 1 :");
        int a  = sc.nextInt();
        System.out.print("Enter the number 2 :");
        int b  = sc.nextInt();
       int  sum=a+b;
        System.out.println("Sum of these number is : " +sum);
        */

        String str = sc.nextLine();
        System.out.println(str);
    }
}
