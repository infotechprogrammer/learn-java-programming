import java.util.Scanner;

public class _13_Perimeter_of_Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int side = input.nextInt();
        int perimeter = 4*side;
        System.out.println("Perimeter of Square = "+perimeter);
    }
}
