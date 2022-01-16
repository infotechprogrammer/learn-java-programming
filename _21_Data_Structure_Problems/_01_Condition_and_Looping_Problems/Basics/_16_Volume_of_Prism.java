import java.util.Scanner;
public class _16_Volume_of_Prism {
    public static void main(String[] args) {
        // volume of prism : V = Bh (B(length X width) = base area, h = height)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the prism");
        double length = input.nextDouble();
        System.out.println("Enter the width of the prism");
        double width = input.nextDouble();
        System.out.println("Enter the height of the prism");
        double height = input.nextDouble();
        double volume = length * width * height;
        System.out.println("The volume of the prism is " + volume);
    }
}
