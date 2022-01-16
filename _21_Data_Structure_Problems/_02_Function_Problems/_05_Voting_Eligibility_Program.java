import java.util.Scanner;
public class _05_Voting_Eligibility_Program {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = inp.nextInt();
        if(can_vote(age)) {
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is not eligible to vote");
        }
    }
    static boolean can_vote(int age) {
        return age >= 18;
    }
}
