import java.util.Scanner;

public class _11_Prime_Numbers_between_two_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers in between which you want prime numbers: ");
        long num1 = in.nextInt();
        long num2 = in.nextInt();
        System.out.print("Prime numbers between "+num1+" and "+num2+" :");
        for(long i = num1; i<=num2; i++) {
            if (prime_bw(i)) {
                System.out.print(i+" ");
            }
        }
     }
    static boolean prime_bw(long num) {
        for(long i=2; i<num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
