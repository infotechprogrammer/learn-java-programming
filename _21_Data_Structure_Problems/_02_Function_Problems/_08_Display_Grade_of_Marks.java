import java.util.Scanner;

public class _08_Display_Grade_of_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = in.nextInt();
        System.out.println("Grade = " + grade(marks));
    }
    static String grade(int m) {
        if(m >= 91 && m <= 100){
            return "AA";
        } else if(m >= 81 && m <= 90){
            return "AB";
        } else if(m >= 71 && m <= 80){
            return "BB";
        } else if(m >= 61 && m <= 70){
            return "BC";
        } else if(m >= 51 && m <= 60){
            return "CC";
        } else if(m >= 41 && m <= 50){
            return "DD";
        } else if(m <= 40 && m>=0){
            return "Fail";
        }else {
            return "No grade because of wrong input";
        }
    }
}
