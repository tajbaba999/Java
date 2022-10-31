import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        System.out.println(series(3));
    }
    public static float series(int n){
        if(n == 0){
            return 1;
        }
     //   float out = 1/(double)Math.pow(2, n);
        return 1/(float)Math.pow(2, n) + series(n-1);

        }
}
