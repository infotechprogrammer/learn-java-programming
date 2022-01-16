import java.util.Scanner;

public class _05_Largest_from_Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = in.nextInt();
        System.out.println("Enter second number:");
        int n2 = in.nextInt();
        if(n1 > n2) {
            System.out.println("Number "+n1+" is Largest");
        } else {
            System.out.println("Number "+n2+" is Largest");
        }
    }
}
