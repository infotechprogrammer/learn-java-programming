package com._02_control_statements;

public class For {
    public static void main(String[] args) {
        System.out.println("Loop from 0 to 5");
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Loop for even numbers 0 to 10");
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);
        }
        //Using for loop with array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String k : cars) {
            System.out.println(k);
        }
    }
}
