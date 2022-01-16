import java.util.Scanner;

public class _13_Subtract_Product_and_Sum_of_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int sum = 0, mul = 1, rem = 1 ;
        while(n>0) {
            rem = n % 10;
            n = n/10;
            sum = sum + rem;
            mul = mul * rem;
        }
        int subtraction = mul - sum;
        System.out.println("Difference of sum from product of given number's digits is "+subtraction);
    }
}
