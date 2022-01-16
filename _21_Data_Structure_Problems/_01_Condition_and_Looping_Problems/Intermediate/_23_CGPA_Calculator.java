import java.util.Scanner;

public class _23_CGPA_Calculator {
    public static void main(String[] args) {
        float subject_grade;
        Scanner in = new Scanner(System.in);
        System.out.print("How many subjects you have ? : ");
        int subject_count = in.nextInt();
        float total_grades = 0;
        for(int i=1; i<=subject_count;i++){
            System.out.print("Enter grade of Subject-"+i+" :");
            subject_grade = in.nextFloat();
            if(subject_grade > 10) {
                System.out.println("Wrong input given");
                break;
            }
            total_grades = subject_grade + total_grades;
        }
        float CGPA = total_grades/subject_count;
        float percentage = CGPA*9.5f;
        System.out.println("Your C.G.P.A. is = "+CGPA);
        System.out.println("Your Percentage is = "+percentage+"%");
    }
}
