package com._01_basics;

public class Variables {
    public static void main (String[] args) {
        String myName = "Sahil";
        int Num = 15;  // declaration with initialization
        Num = 20;  // initialization afterwards
        System.out.println(Num);
        final int myConst = 30;
        System.out.println(myConst);
        //myNum = 25;  // will generate an error: cannot assign a value to a final variable

        // other data types

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println("Integer Value = "+myNum);
        System.out.println("Integer Value = "+myFloatNum);
        System.out.println("Integer Value = "+myLetter);
        System.out.println("Integer Value = "+myBool);
        System.out.println("Integer Value = "+myText);

        // For numeric values, the + character works as a mathematical operator
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        // Declare Many Variables
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);
        System.out.println(a+ "" +b+ "" +c);
    }
}

// variable declaration :
// data type variable_name = value;
/* you can add the final keyword if you don't want others
(or yourself) to overwrite existing values
(this will declare the variable as "final" or "constant",
which means unchangeable and read-only */
// Here x. y , a,b myNum and more of these are called java identifiers