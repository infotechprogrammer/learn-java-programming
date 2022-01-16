//Depreciation is a financial word, defined as the reduction of the recorded cost of
//a fixed asset in a systematic manner until the value of the asset becomes zero or negligible.
import java.util.Scanner;
public class _21_Depreciation_of_Value {
    public static void main(String[] args) {
        long amount, dep_percentage, years, amount_after_dep;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount/value of product/thing: Rs.");
        amount = in.nextLong();
        System.out.print("Enter depreciation percentage: ");
        dep_percentage = in.nextLong();
        System.out.print("Enter number of years: ");
        years = in.nextLong();
        amount_after_dep = amount;
        for(int i=1;i<=years;i++){
            amount_after_dep=((100-dep_percentage)*amount_after_dep)/100;
            System.out.println("Amount after "+i+" year depreciation: Rs."+amount_after_dep);
        }
    }
}
