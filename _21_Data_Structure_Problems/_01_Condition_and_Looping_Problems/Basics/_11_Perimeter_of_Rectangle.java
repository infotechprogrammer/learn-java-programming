import java.util.Scanner;

public class _11_Perimeter_of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = in.nextDouble();
        double perimeter = 2*(length + breadth);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
