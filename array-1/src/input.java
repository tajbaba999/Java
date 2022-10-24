import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 3467;
        arr[1] = 3434;
        arr[2] = 34345;
        arr[3] = 3445;
        arr[4] = 341;
        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int num : arr) { // for every element in array, print the element
            System.out.print(num + " "); //  here num represents element of the array
        }

        System.out.println(arr[5]); // index out of bound error

        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
