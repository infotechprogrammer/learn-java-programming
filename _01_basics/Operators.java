import java.util.Scanner;
public class Operators {
    public static void main (String[] args) {
        int x,y,sum,sub,mul,div,mod;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter value of x");
        x = inp.nextInt();
        System.out.println("Enter value of y");
        y = inp.nextInt();
        sum = x + y;
        sub = x - y;
        mul = x * y;
        div = x / y;
        mod = x % y;
        System.out.println("Sum = "+sum);
        System.out.println("Sum = "+sub);
        System.out.println("Sum = "+mul);
        System.out.println("Sum = "+div);
        System.out.println("Sum = "+mod);
    }
}
