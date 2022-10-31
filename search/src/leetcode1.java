import java.util.Scanner;
import java.util.Arrays;

public class leetcode1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        for (int h = 0; h < 2; h++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+" ");
            }
            
        }

    }
}
