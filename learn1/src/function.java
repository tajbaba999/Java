import java.util.Scanner;

public class function {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        int a = in.nextInt();
//        System.out.println("Enter the value of b");
//        int b = in.nextInt();
//        int sum1 = sum(20, 30);
//        System.out.println(sum1);
//    }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int a = in.nextInt();
        System.out.println("Ente the number 2");
        int b = in.nextInt();
        int sum1 = hum(a,b);
        System.out.println(sum1);





    }
    static int hum(int a,int b){
        return a + b;

    }
}

