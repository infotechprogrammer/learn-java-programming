import java.util.Scanner;
public class _18_Volume_of_Pyramid  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base length, base width and height of pyramid: ");
        float base_length = input.nextFloat();
        float base_width = input.nextFloat();
        float height = input.nextFloat();
        float volume = (base_length*base_width*height)/3;
        System.out.print("Volume of Pyramid: "+volume);
    }
}
