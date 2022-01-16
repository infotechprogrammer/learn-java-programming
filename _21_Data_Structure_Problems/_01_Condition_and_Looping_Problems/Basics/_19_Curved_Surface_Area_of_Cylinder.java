import java.util.Scanner;
public class _19_Curved_Surface_Area_of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius and height of cylinder: ");
        int r = input.nextInt();
        int h = input.nextInt();
        double pi = 3.14159;
        double surface_area = 2*pi*r*h;
        System.out.println("Curved surface area of cylinder = "+surface_area);
    }
}
