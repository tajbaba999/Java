public class AlternateDigitSum {
    public static int alternateDigitSum(int n) {
        int i = 0, sum = 0;
        n = reverse(n);
        while (n > 0) {
            int rem = n % 10;
            sum += (i++ % 2 == 0) ? rem : -rem;
            n = n / 10;
        }
        return sum;
    }
        public static int reverse(int n){
            int rev = 0;
            while (n > 0){
                rev = rev * 10 +n%10;
                n = n/10;
            }
            return rev;
        }



    public static void main(String[] args) {
//       int ans1 =
              int ans = alternateDigitSum(521);
        System.out.println(ans);
    }
}
