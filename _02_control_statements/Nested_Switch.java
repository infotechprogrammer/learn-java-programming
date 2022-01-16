import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int empID = inp.nextInt();
        String department = inp.next();

        //ENHANCED SWTICH STATEMENT

        switch (empID) {
            case 1 -> System.out.println("Sahil Batra");
            case 2 -> System.out.println("Kabir Jangra");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct Emp ID");
        }
    }
}
// OR NORMAL SWITCH STATEMENT

//        switch (empID) {
//            case 1:
//                System.out.println("Sahil Batra");
//                break;
//            case 2:
//                System.out.println("Kabir Jangra");
//                break;
//            case 3:
//                System.out.println("Employee Number 3");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default:
//                System.out.println("Enter correct Emp ID");
//        }

