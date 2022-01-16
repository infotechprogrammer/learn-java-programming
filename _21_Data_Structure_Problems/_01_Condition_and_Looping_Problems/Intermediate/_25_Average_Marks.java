import java.util.Scanner;
public class _25_Average_Marks {
    public static void main(String[] args) {
        int sub_marks;
        Scanner in = new Scanner(System.in);
        System.out.print("How many subjects you have ? : ");
        int subjects = in.nextInt();
        float total_marks = 0;
        for(int i=1; i<=subjects;i++){
            System.out.print("Enter marks of Subject-"+i+" :");
            sub_marks = in.nextInt();
            total_marks = sub_marks + total_marks;
        }
        float avg_marks = total_marks/subjects;
        System.out.println("Average Marks: "+avg_marks);
    }
}
