/*
Eg:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.
 */
import java.util.Scanner;
public class _15_Electricity_Bill {
    public static void main(String[] args) {
        double amount, total_amount, sur_charge;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter total units consumed: ");
        int unit = inp.nextInt();
        if(unit <= 50) {
            amount = unit * 0.50;
        } else if(unit <= 150) {
            amount = 25 + ((unit-50) * 0.75);
        } else if(unit <= 250) {
            amount = 100 + ((unit-150) * 1.20);
        } else {
            amount = 220 + ((unit-250) * 1.50);
        }
        sur_charge = amount * 0.20;
        total_amount = amount + sur_charge;
        System.out.print("Electricity Bill = Rs"+total_amount);
    }
}
