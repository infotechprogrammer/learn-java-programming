import java.util.Scanner;

public class _09_Factorial_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int n = in.nextInt();
        System.out.println(n+"! = "+Factorial(n));
    }
    static long Factorial(int n) {
        long fact = 1;
        for(int i=1; i<=n;i++) {
            fact = fact*i;
        }
        return fact;
    }
}
