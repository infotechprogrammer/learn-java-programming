import java.util.Scanner;
public class _27_Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int r,temp=num,sum=0;
        while(temp>0) {
            r = temp % 10;
            sum = sum + (r*r*r);
            temp = temp / 10;
        }
        if(num == sum) {
            System.out.println(num+" is an armstrong number.");
        } else {
            System.out.println(num+" is not an armstrong number.");
        }
    }
}
