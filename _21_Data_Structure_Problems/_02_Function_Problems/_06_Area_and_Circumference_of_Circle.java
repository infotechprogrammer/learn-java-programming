import java.util.Scanner;

public class _06_Area_and_Circumference_of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = in.nextInt();
        System.out.println("Area of Circle = "+c_area(r));
        System.out.println("Circumference of Circle = "+c_cir(r));
    }
    static double c_area(int rad) {
        double pi = 3.141592653589793238;
        double area = pi*(rad*rad);
        return area;
    }
    static double c_cir(int rad) {
        double pi = 3.141592653589793238;
        double cir = 2*pi*rad;
        return cir;
    }
}
