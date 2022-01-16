import java.util.Scanner;

public class _03_Find_Max_and_Min_Numbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Maximum number: "+max(a,b,c));
        System.out.print("Minimum Number: "+min(a,b,c));
    }
    static int max(int a, int b, int c) {
        int max = a;
        if(max < b) {
            max = b;
        } if(max < c) {
            max = c;
        }
        return max;
    }
    static int min(int a, int b, int c) {
        int min = a;
        if(min > b) {
            min = b;
        } if(min > c) {
            min = c;
        }
        return min;
    }
}
