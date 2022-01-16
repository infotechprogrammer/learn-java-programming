// Formula: Compound Interest = P(1 + R/100)power(r)
import java.util.Scanner;
public class _24_Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle(amount): ");
        double principle = in.nextDouble();
        System.out.print("Enter Time: ");
        int time = in.nextInt();
        System.out.print("Enter Rate of Interest: ");
        double rate = in.nextDouble();
        double compound_Interest = principle*(Math.pow((1+rate/100),time));
        System.out.println("Compound Interest = "+compound_Interest);
    }
}
