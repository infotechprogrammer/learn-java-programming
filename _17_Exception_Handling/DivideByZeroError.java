package com._17_Exception_Handling;

public class DivideByZeroError {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        int x = a/(b-c);
        System.out.println("X = "+x);
        int y = a/(b+c);
        System.out.println("Y = "+y);
        //This program will give error/exception
    }
}