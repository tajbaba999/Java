import java.util.Scanner;

public class power {



    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//        int n = s.nextInt();

        System.out.println(power1(3, 4));
    }
    public static int power1(int x, int n){
        if(n == 0){
            return 1;
        } else if (n == 1) {
            return x;
        }
        int smalloutput = x * power1(x, n-1);
        return smalloutput;
    }
}
