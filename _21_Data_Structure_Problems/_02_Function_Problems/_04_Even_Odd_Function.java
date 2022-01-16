import java.util.Scanner;

public class _04_Even_Odd_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println("Number is "+odd_even(num));
    }
    static String odd_even(int n) {
        if(n % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }
}
