import java.util.Scanner;
public class _17_Discount_of_Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of product: ");
        int price = input.nextInt();
        System.out.print("Enter the percentage of discount: ");
        float discount_percentage = input.nextFloat();
        float discount_amount = (price*discount_percentage)/100;
        float final_price = price - discount_amount;
        System.out.println("Final Price after Discount = "+final_price);
    }
}
