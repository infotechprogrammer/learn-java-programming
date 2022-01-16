import java.util.Scanner;
public class _09_Perimeter_of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        int a = input.nextInt();
        int perimeter = 3*a;
        System.out.println("Perimeter of equilateral triangle is "+perimeter);
    }
}
