import java.util.Scanner;

public class _10_Perimeter_of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and side of the parallelogram : ");
        double b = input.nextDouble();
        double a = input.nextDouble();
        double perimeter = 2*(b+a);
        System.out.println("Perimeter of parallelogram is " + perimeter);
    }
}
