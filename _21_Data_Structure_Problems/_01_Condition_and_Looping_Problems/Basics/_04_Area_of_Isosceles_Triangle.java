import java.util.Scanner;
public class _04_Area_of_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter equal side of triangle: ");
        float a = in.nextFloat();
        System.out.print("Enter final side (base) of triangle: ");
        float b = in.nextFloat();
        while(a<=b/2) {
            System.out.println("Same sides length must be more than half of the final side (base)");
            a = 0;
            System.out.print("Please enter equal sides of triangle again: ");
            a = in.nextFloat();
        }
        double area = (Math.sqrt((a*a)-((b*b)/4))*b) / 2;
        System.out.println("Area of isosceles triangle: "+area);
    }
}
