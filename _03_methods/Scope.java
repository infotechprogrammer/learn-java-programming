package com._03_methods;

public class Scope {
    public static void main(String[] args) {

        // Code here CANNOT use x

        int x = 1000;

        // Code here can use x
        System.out.println(x);

        { // This is a block

            // Code here CANNOT use y

            int y = 100;

            // Code here CAN use x
            System.out.println(y);

        } // The block ends here

        // Code here CANNOT use y

    }
}
