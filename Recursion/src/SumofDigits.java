public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sum(155));
    }
    public static int sum(int n){
        if(n/10 == 0){
            return n;
        }
        int smallout = n%10;
        return smallout + sum(n/10);
    }
}
