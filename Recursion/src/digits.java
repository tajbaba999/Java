public class digits {
    public static void main(String[] args) {
        System.out.println(digits( 7));
    }
    public static int digits(int n){
        int qui = n/10;
        int rem = n%10;
        if (n == 0){
            return 0;
        }

        int output = rem + digits(qui);
        return output;
    }
}
