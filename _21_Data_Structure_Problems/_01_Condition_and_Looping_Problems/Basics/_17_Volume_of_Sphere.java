import java.util.Scanner;
public class _17_Volume_of_Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        int r = input.nextInt();
        double pi = 3.14159;
        double volume = (4*pi*r*r*r)/3;
        System.out.print("Volume of sphere: "+volume);
    }
}
