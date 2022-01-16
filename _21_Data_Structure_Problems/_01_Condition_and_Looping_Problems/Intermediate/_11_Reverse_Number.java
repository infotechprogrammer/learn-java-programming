import java.util.Scanner;
public class _11_Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;
        while (num>0) {
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reversed Number: "+ans);
    }
}
