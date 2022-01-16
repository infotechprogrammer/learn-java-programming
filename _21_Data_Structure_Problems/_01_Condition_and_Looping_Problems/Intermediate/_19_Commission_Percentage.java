import java.util.Scanner;

public class _19_Commission_Percentage {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter amount given by client: ");
        int amount = inp.nextInt();
        System.out.print("Enter commission received from that: ");
        int commission = inp.nextInt();
        if(commission < amount) {
            int comm_percentage = (commission*100)/amount;
            System.out.println("Commission Percentage you got = "+comm_percentage+"%");
        } else {
            System.out.println("It is impossible to have commission more than amount given by client");
        }
    }
}
