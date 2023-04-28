package com.company;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class cwh_13_Strings {
    public static void main(String[] args) {
        //String name =new String("neha");
        //System.out.println(name);
        //String name ="Neha";
        //System.out.println(name);
       // int a =6;
        //float b= 5.6445f;
       // System.out.printf("the value of a is %d and value of b is %f ", a, b);
       // System.out.format("the value of a is %d and value of b is %f ", a, b);
       // Scanner sc= new Scanner(System.in);
        //String st = sc.nextLine();
        //System.out.println(st);
       // String name = new String("Neha");
       // ******************* String method ------ .length(),toLowercase(),toUpperCase(),.substring(),replace,.startswith,.endswith,--------
                              // String nonTrimmedString = "    Neha is best    ";
                              // String str = name.nonTrimmedString;
        //  System.out.println(nonTrimmedString.trim());
        String name = "Neha is best";
       //System.out.println(name.substring(2,6));
        //System.out.println(name.replace('e','i'));
      /*  System.out.println(name.replace("Neha","love"));
        System.out.println(name.startsWith("Neha"));
        System.out.println(name.endsWith("hest"));
        System.out.println(name.charAt(11));
        System.out.println(name.indexOf("s"));
        System.out.println(name.indexOf("best",4));
        System.out.println(name.lastIndexOf("Neha",5));   //dont understand
       */
        System.out.println(name.equals("Neha is best"));
        System.out.println(name.equalsIgnoreCase("neha is best"));
    }
}
