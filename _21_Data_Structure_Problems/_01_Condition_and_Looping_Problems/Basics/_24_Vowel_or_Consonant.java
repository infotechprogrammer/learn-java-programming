import java.util.Scanner;

public class _24_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any Word: ");
        String wd = in.nextLine();
        char al = wd.trim().charAt(0);
        if(al == 'a' || al == 'e' || al == 'i' || al == 'o' || al == 'u' || al == 'A' || al == 'E' || al == 'I' || al == 'O' || al == 'U') {
            System.out.println(wd+" is a Vowel");
        } else {
            System.out.println(wd+" is a Consonant");
        }
    }
}
