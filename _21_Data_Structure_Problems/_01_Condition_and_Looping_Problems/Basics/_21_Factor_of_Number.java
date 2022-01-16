import java.util.Scanner;
public class _21_Factor_of_Number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number whose factor you want:");
        int n = inp.nextInt();
        System.out.print("Factors of "+n+" are :");
        for(int i=1;i<=n;i++){
            if(n%i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
