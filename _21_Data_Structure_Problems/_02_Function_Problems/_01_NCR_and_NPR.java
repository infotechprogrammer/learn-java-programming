import java.util.Scanner;

public class _01_NCR_and_NPR {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = inp.nextInt();
        System.out.print("Enter value of r: ");
        int r = inp.nextInt();
        System.out.println("NCR ("+n+"C"+r+") = "+find_ncr(n,r));
        System.out.println("NPR ("+n+"P"+r+") = "+find_npr(n,r));
    }
    static long factorial(int n) {
        long fact = 1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
        }
        return fact;
    }
    static long find_ncr(int n, int r) {
        long ncr = factorial(n)/(factorial(r)*factorial((n-r)));
        return ncr;
    }
    static long find_npr(int n, int r) {
        long npr = factorial(n)/factorial(n-r);
        return npr;
    }
}
