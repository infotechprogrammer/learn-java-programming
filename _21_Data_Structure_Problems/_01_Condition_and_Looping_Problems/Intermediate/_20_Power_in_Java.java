import java.util.Scanner;
public class _20_Power_in_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base, exponent;
        System.out.print("Enter number whose power you want(Enter base): ");
        base = in.nextInt();
        System.out.print("Enter power of "+base+" you want(Enter Exponent): ");
        exponent = in.nextInt();
        int result = 1;
        int i = exponent;
        while (i > 0) {
            result = result * base;
            i--;
        }
        System.out.println(+base+" power "+exponent+" = "+result);
    }
}
