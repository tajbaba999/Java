import java.util.Scanner;
import java.lang.Math;
public class hackerrank1 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
       // int t = in.nextInt();
        double sum = 0;
       // for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

        for (int j = 0; j < n; j++) {
                    sum=0;
                    sum = sum + b * Math.pow(2, j);
                    j = j +j;
        }
            sum = sum + a;
            System.out.println(sum);
        }

    }




  //      for (int h = 0; h < n; h++) {
//                int c = 1;
//                sum = c * b;
//                c = c + c;
//                sum = sum + a;
//                System.out.print(sum);