import java.util.Scanner;
// Shorthand Switch Statement
public class Enhanced_Switch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String fruit = inp.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("Small green fruit");
            default -> System.out.println("Please enter a valid food");
        }
    }
}
