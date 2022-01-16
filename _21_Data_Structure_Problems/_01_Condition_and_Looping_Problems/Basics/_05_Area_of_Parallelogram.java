import java.util.Scanner;
public class _05_Area_of_Parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of the parallelogram : ");
        double b = input.nextDouble();
        double h = input.nextDouble();
        double area = b * h;
        System.out.println("Area of parallelogram is " + area);
    }
}
