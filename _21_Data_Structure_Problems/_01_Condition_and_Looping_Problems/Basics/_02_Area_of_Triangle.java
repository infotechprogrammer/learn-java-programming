import java.util.Scanner;
public class _02_Area_of_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base and height of triangle: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is " + area);
    }
}
