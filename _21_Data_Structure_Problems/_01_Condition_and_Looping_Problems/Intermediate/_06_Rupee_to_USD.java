// Input currency in rupees and output in USD.

import java.util.Scanner;

public class _06_Rupee_to_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter currency in rupees");
        int rupee = in.nextInt();
        float USD = rupee * 0.01357f;
        System.out.println("Currency in USD = "+USD+"USD");
    }
}
