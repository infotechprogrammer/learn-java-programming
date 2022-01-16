// Program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class _03_Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float P = in.nextFloat();
        System.out.print("Enter Rate: ");
        float R = in.nextFloat();
        System.out.print("Enter Time: ");
        float T = in.nextFloat();
        float SI = (P*R*T)/100;
        System.out.println("Simple Interest is : "+SI);
    }
}
