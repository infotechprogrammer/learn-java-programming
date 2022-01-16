// Sum of square of first two digits of number is equal to square of third digit number
import java.util.Scanner;
public class _12_Check_Number_is_Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 3digit number: ");
        int triplet = in.nextInt();
        if(pythagorean_t(triplet)) {
            System.out.println("Number is Pythagorean Triplet Number");
        } else {
            System.out.println("Number is not Pythagorean Triplet Number");
        }
    }
    static boolean pythagorean_t(int n) {
        int temp = n;
        int rem,digit1and2 =0, digit3;
            rem = temp % 10;
            digit3 = rem * rem;
            temp = temp/10;
            while(temp != 0) {
                rem = temp % 10;
                digit1and2 = digit1and2 + (rem * rem);
                temp = temp/10;
            }
            return (digit1and2 == digit3);
    }
}
