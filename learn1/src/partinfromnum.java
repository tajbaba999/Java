import java.util.Scanner;

public class partinfromnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
                int n = in.nextInt();
        System.out.println("Enter the serach number");
                int v = in.nextInt();
                int c=0;
        while (n!=0){
            if(n%10==v){
                c++;
            }
            n=n/10;
        }

        System.out.println(" "+c);
    }
}
