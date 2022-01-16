import java.util.Scanner;

public class _13_Check_Pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a single digit number-1: ");
        int n1 = in.nextInt();
        System.out.print("Enter a single digit number-2: ");
        int n2 = in.nextInt();
        System.out.print("Enter a single digit number-3: ");
        int n3 = in.nextInt();
        if (pythagorean_triplet(n1,n2,n3)) {
            System.out.println("Number is Pythagorean Triplet Number");
        } else {
            System.out.println("Number is not Pythagorean Triplet Number");
        }
    }
    static boolean pythagorean_triplet(int a, int b, int c) {
        int max = max_num(a, b, c);
        if (max == a) {
            return (a * a) == (b * b) + (c * c);
        } else if (max == b) {
            return (b * b) == (a * a) + (c * c);
        } else {
            return (c * c) == (a * a) + (b * b);
        }
    }
    static int max_num(int x, int y, int z) {
        int max = x;
        if(max < y) {
            max = y;
        } if(max < z) {
            max = z;
        }
        return max;
    }
}
