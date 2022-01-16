//Adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:
public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int resultn = sumn(5,10);
        System.out.println(resultn);
    }
//Use recursion to add all numbers up to 10
    public static int sum(int k) {
        if(k>0) {
            return k + sum(k-1);
        } else {
            return 0;
        }
    }
//Use recursion to add all numbers between start to end
        public static int sumn(int start, int end) {
            if(end > start) {
                return end + sumn(start, end - 1);
            } else {
                return end;
            }
        }
}
