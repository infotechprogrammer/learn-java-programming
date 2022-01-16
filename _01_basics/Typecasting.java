package com._01_basics;

public class Typecasting {
    public static void main(String[] args) {

        //Widening Casting

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //Narrowing Casting

        double myDoublen = 9.78d;
        int myIntn = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9 but still its a wrong practise
    }
}
