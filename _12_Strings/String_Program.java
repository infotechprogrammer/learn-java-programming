package com._12_Strings;

import java.util.Scanner; //Note: This is not imported for string only for Scanner class

public class String_Program {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("how are you?");
        String name = new String();
        String fname; //It's your choice to declare it like that or like above line
        String c = "What about your friend";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = in.nextLine();
        System.out.println("Enter your friend name:");
        fname = in.nextLine();
        System.out.println(a+" "+name+" "+b+" "+c+" "+fname);
    }
}
