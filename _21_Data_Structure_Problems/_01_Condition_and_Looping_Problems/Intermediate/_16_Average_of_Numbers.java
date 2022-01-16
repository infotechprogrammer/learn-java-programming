import java.util.Scanner;

public class _16_Average_of_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers you want to: ");
        int n = in.nextInt();
        int num;
        float sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print("Enter Number-"+i+" = ");
            num = in.nextInt();
            sum = sum + num;
        }
        float avg = sum/n;
        System.out.println("Average = "+avg);
    }
}
