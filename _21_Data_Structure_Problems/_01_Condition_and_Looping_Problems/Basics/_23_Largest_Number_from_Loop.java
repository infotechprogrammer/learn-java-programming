import java.util.Scanner;
public class _23_Largest_Number_from_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0, a;
        while(true) {
            System.out.print("Enter number: ");
            a = input.nextInt();
            if (a == 0) {
                break;
            } else if(a>largest) {
                largest = a;
            }
        }
        System.out.print("Largest number : "+largest);
    }
}
