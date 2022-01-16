import java.util.Scanner;

public class _12_Calculator_Program {
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        //Take input from user till user not press x or X for operation
        while(true) {
            System.out.println("Enter the operation: ");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter first number: ");
                int num1 = input.nextInt();
                System.out.println("Enter second number: ");
                int num2 = input.nextInt();
                if(op == '+') {
                    ans = num1 + num2;
                }
                if(op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*') {
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
                System.out.println();
            }
            System.out.println("Result = "+ans);
            System.out.println();
        }
    }
}
