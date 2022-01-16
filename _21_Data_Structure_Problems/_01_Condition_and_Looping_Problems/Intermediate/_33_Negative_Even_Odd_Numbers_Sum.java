import java.util.Scanner;
public class _33_Negative_Even_Odd_Numbers_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, nsum = 0, esum = 0, osum = 0;
        while(true) {
            System.out.print("Enter number: ");
            num = in.nextInt();
            if(num < 0) {
                nsum = nsum + num;
            } else if(num > 0 && num % 2 == 0) {
                esum = esum + num;
            } else if (num > 0 && num %2 != 0) {
                osum = osum + num;
            } else if(num == 0){
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
        System.out.println("Sum of negative numbers= "+nsum);
        System.out.println("Sum of positive even numbers= "+esum);
        System.out.println("Sum of positive odd numbers= "+osum);
    }
}
