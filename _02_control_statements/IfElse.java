public class IfElse {
    public static void main (String[] args) {
        //if statement
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }
        //if else statement
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //else if statement
        int t = 22;
        if (t < 10) {
            System.out.println("Good morning.");
        } else if (t < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //Short Hand if..else (Ternary Operator)
        int timezone = 20;
        String result = (timezone < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
