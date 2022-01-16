package com._03_methods;
import java.util.Arrays;

public class Variable_Length_Arguments {
    public static void main(String[] args) {

        mix_vargs(10,20,"Hello","Bye");
        vargs(100,20,25,26,28);
    }
    static void vargs(int ...v) {
        System.out.println("Variable Arguments of Int below:");
        System.out.println(Arrays.toString(v));
    }
    static void mix_vargs(int a, int b, String ...v) {
        int sum = a+ b;
        System.out.println("Sum is ="+sum);
        System.out.println("Variable Arguments of String below:");
        System.out.println(Arrays.toString(v));
    }
}
