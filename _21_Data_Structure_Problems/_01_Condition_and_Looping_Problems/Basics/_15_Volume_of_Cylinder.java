import java.util.Scanner;
public class _15_Volume_of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius and height of cylinder: ");
        int r = input.nextInt();
        int h = input.nextInt();
        double pi = 3.14159;
        double volume = pi*r*r*h;
        System.out.println("Volume of cylinder = "+volume);
    }
}
