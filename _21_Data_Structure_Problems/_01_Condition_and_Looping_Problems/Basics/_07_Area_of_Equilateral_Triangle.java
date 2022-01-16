import java.util.Scanner;

public class _07_Area_of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle: ");
        int a = input.nextInt();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area of equilateral triangle is "+area);
    }
}
