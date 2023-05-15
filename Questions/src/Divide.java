public class Divide {
    public static void main(String[] args) {
        divide(-2147483648,-1);
    }
    public static void divide(int dividend, int divisor) {

        if(dividend <0 && divisor < 0){
            int ans = dividend/divisor;
            ans = ans * 1;
            System.out.println(ans);
        }
        int ans = dividend/dividend;
        System.out.println(ans);
    }
}
