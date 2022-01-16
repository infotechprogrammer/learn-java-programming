import java.util.Scanner;
public class _08_Perimeter_of_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = input.nextInt();
        double pi = 3.14;
        double perimeter = 2*pi*r;
        System.out.println("Perimeter of Circle = "+perimeter);
    }
}
