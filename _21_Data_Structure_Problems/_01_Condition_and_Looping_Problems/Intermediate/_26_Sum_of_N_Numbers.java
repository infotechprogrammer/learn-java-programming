import java.util.Scanner;

public class _26_Sum_of_N_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to enter? : ");
        int n = input.nextInt();
        int sum = 0;
        int a;
        for(int i=1; i<=n; i++ ) {
            System.out.print("Enter number-"+i+": ");
            a = input.nextInt();
                sum = sum + a;
        }
        System.out.println("Sum of "+n+" numbers = "+sum);
    }
}
