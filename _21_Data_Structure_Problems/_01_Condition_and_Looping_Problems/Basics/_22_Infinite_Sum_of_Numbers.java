import java.util.Scanner;

public class _22_Infinite_Sum_of_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int a;
        while(true) {
            System.out.print("Enter number: ");
            a = input.nextInt();
            if (a == 0) {
                sum = sum + a;
// Add below lines if you want to give sum in the end also or only in the end
//                System.out.println("Sum = " + sum);
//                break;
            } else {
                sum = sum + a;
                System.out.println("Sum = " + sum); //If you don't want to print sum everytime then you can skip this line to use and instead use line 16 and 17
            }
        }
    }
}
