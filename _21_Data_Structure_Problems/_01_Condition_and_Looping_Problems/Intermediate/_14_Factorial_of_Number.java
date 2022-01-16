import java.util.Scanner;

public class _14_Factorial_of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int fact = 1;
        for(int i = n; i>=1; i--) { // or for(int i = 1; i<=n; i++)
            fact = fact * i;
        }
        System.out.print("Factorial of "+n+" = "+fact);
    }
}
