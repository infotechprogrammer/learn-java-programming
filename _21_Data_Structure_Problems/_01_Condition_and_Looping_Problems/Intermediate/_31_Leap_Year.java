import java.util.Scanner;

public class _31_Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        if(year % 4 == 0) {
            System.out.println(year+" is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
