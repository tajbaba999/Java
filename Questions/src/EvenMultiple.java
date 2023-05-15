
public class EvenMultiple {
    public static void main(String[] args) {
        int n = 6;
       int ans = smallestEvenMultiple(n);
        System.out.println("Answer ="+ans);
    }
    public static int smallestEvenMultiple(int n) {
        if(prime(n)){
            return n*2;
        }
        for (int i = 1; i <=n; i++) {
            if(i%n==0 && i%2 == 0){
                return i;

            }
        }
        return n;
    }

    private static boolean prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
