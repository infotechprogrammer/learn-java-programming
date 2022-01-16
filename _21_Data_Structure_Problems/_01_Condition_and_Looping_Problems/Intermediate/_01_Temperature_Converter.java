// This program will convert degree C to F ( Celcius to farenheit )

import java.util.Scanner;

public class _01_Temperature_Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in C:");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temp in F :"+tempF);
    }
}
