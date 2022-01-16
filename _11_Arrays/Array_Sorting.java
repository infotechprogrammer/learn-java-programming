package com._11_Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
        int number[] = {56, 48, 88, 60, 72};
        int n = number.length; // Array Length
        System.out.println("Given List: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println("\n");
        //Sorting Begins
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (number[i] < number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            } // Sorting Ends
        }
        System.out.println("Sorted List");
        for(int i = 0; i<n; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println(" ");
    }
}
