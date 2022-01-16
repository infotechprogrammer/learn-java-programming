import java.util.Scanner;

public class _12_Perimeter_of_Rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Rhombus: ");
        int side = input.nextInt();
        int perimeter = 4*side;
        System.out.println("Perimeter of Rhombus = "+perimeter);
    }
}
