// Eg: If number given is 13839 here count number of 3 from this number using programming
import java.util.Scanner;
public class _10_Count_RepeatingNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter repeating number you want to check");
        int r = input.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if(rem == r) {
                count ++;
            }
            n = n / 10;  // n = /=10
        }
        System.out.println(r+" is repeating " +count+ " times");
    }
}
