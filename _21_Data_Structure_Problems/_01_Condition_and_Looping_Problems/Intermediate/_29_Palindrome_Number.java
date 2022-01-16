import java.util.Scanner;

public class _29_Palindrome_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = in.nextInt();
        long r,temp=num,mul=0;
        while(temp>0) {
            r = temp % 10;
            mul = (mul * 10) + r;
            temp = temp / 10;
        }
        if(mul == num) {
            System.out.println(num+" is a palindrome number.");
        } else {
            System.out.println(num+" is not a palindrome number.");
        }
    }
}
