import java.util.Scanner;
public class _18_Distance_Between_Two_Points {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter co-ordinates first point: ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.print("Enter co-ordinates second point ");
        x2 = in.nextInt();
        y2 = in.nextInt();
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.print("Distance between points ("+x1+","+y1+") ("+x2+","+y2+") = "+distance);

    }
}
