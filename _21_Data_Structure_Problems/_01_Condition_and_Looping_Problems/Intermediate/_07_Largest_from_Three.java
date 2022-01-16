// Print largest among 3 numbers

import java.util.Scanner;

public class _07_Largest_from_Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = a;
//        if(b > max) {
//            max = b;
//        }
//        if(c > max) {
//            max = c;
//        }

        int max = Math.max(c, Math.max(a,b));

        System.out.println(max);
    }
}
