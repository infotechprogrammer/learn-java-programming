import java.util.Scanner;
public class _20_Total_Surface_Area_of_Cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of cube: ");
        int a = input.nextInt();
        int total_surface_area = 6*a*a;
        System.out.print("Total Surface Area of Cube = "+total_surface_area);
    }
}
