import java.util.Scanner;

public class _30_Perfect_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int rem,sum=0;
        for(int i =1;i<num;i++) {
            rem = num % i;
            if(rem == 0) {
                sum = sum + i;
            }
        }
        if(sum == num) {
            System.out.println(num+" is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
