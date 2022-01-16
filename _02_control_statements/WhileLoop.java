package com._02_control_statements;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Loop from 0 to 5");
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("\nLoop from 5 to 0");
        int j = 5;
        while (j >= 0) {
            System.out.println(j);
            j--;
        }
    }
}
