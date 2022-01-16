import java.util.Scanner;
public class _03_Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = in.nextDouble();
        double area = length * breadth;
        System.out.println("Area of rectangle is " + area);
    }
}
