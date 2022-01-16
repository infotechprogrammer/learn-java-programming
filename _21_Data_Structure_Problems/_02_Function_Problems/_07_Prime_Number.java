import java.util.Scanner;
public class _07_Prime_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("Number is neither prime nor composite");
        } else {
            System.out.println("Number " + prime(num));
        }
    }
    static String prime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return "is not Prime";
            }
        }
        return "is Prime";
    }
}
