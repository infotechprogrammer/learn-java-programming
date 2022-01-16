import java.util.Scanner;
public class _01_Area_of_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = input.nextInt();
        float pi = 3.14159f;
        float area = pi*r*r;
        System.out.println("Area of Circle = "+area);
    }
}
