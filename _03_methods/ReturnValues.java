package com._03_methods;

public class ReturnValues {
    static int myMethod(int x, int y) {
        return x + y;
    }
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }


    public static void main(String[] args) {
        System.out.println("Sum = "+myMethod(5,10));
        int z = myMethod(11,18);
        System.out.println("Z = "+z+"\n");

        checkAge(2); // Call the checkAge method and pass along an age of 20
        checkAge(20);
    }
}
