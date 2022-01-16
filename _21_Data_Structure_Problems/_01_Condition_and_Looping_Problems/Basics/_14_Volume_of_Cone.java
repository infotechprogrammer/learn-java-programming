import java.util.Scanner;
public class _14_Volume_of_Cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius and height of cone: ");
        int r = input.nextInt();
        int h = input.nextInt();
        double pi = 3.14159;
        double volume = pi*r*r*h/3;
        System.out.println("Volume of cone = "+volume);
    }
}
