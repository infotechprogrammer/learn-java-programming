import java.util.Scanner;

public class _02_Print_Armstrong_Numbers {
    public static void main(String[] args) {
        System.out.println("3 digit Armstrong numbers:");
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmstrong(int num) {
        int r,temp=num,sum=0;
        while(temp>0) {
            r = temp % 10;
            sum = sum + (r*r*r);
            temp = temp / 10;
        }
        return sum == num;
        }
}

