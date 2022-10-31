public class natural1ton {
    public static void main(String[] args) {
        //nat(4);
        fib(5);
    }

    public static void nat(int n){
        if(n == 0){
            return;
        }
        //System.out.println(nat(n-1));
        //return nat(n-1);

    }
    public static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int sum = fib1 + fib2;
        return sum;
    }
}