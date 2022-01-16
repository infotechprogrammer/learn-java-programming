package com._12_Strings;

public class String_Functions {
    public static void main(String[] args) {
        String a = "Here is the first String";
        System.out.println("Length of string is: "+a.length());
        System.out.println("String in UPPERCASE: "+a.toUpperCase());
        System.out.println("String in lowercase: "+a.toLowerCase());
        System.out.println(a.indexOf("first"));
        String firstName = "Sahil";
        String lastName = " Batra";
        System.out.println(firstName.concat(lastName));
        String txt = "We are the so-called \"Punjabi\" from the north.";
        System.out.println(txt);
        String text = "The character \\ is called backslash.";
        System.out.println(text);
        String x = "10";
        int y = 20;
        String z = x + y;   // z will be 1020 (a String)
        System.out.println(z);
    }
}