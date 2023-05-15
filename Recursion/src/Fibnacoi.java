public class Fibnacoi {
    int dp[] = new int[31];
    public static void main(String[] args) {
         int ans = fib(4);
         System.out.println(ans);
    }
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+ fib(n-2);

    }

    }
