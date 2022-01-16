import java.util.Scanner;

public class _22_Batting_Average {
    public static void main(String args[])
    {
        long Matches,runs,innings,notout;
        double avg;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of matches played");
        Matches=in.nextLong();

        while(true) {
            System.out.println("enter the number innings batted");
            innings = in.nextLong();
            if (innings <= Matches){
                break;
            }
            System.out.println("enter the number innings batted correctly <=matches");
        }

        while(true)
        {
            System.out.println("enter number of times notout");
            notout=in.nextLong();
            if(notout<=innings){
                break;
            }
            System.out.println("enter the number times became notout correctly <=innings");
        }

        System.out.println("enter runs scored");
        runs=in.nextLong();
        if(innings==notout) {
            avg = runs;
        } else {
            avg = runs / (innings - notout);
            System.out.println("batting average=" + avg);
        }
    }
}
