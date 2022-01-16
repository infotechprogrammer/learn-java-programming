import java.util.Scanner;

public class _10_Sum_of_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        System.out.print("Sum of first "+n+" natural numbers = "+sum_natural(n));
    }
    static long sum_natural(int n) {
        long sum = 0;
        for(int i=1; i<=n; i++){
          sum = sum + i;
        }
        return sum;
    }
}
