public class _32_Even_Days_in_August {
    public static void main(String[] args) {
        int days_in_august = 31, sum = 0;
        for(int i=1;i<=31;i++) {
            if(i%2 == 0){
                sum = sum + 1;
            }
        }
        System.out.println("Even days in august month = "+sum);
    }
}
