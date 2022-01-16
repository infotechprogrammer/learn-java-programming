// Print Fibonacci number

import java.util.Scanner;

public class _09_Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        if(n==0) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

}
