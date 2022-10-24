import java.util.Scanner;

public class twoDarrys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr1 = new int[3][];//declaration of 2-d arrays

        int [][] arr2D =        // Both tyes are used to declear an array
                {
                        {2, 6, 4},//0th index
                        {45, 78, 23, 67},// 1st index
                        {67, 12, 34},// 2nd index

                };
        int[][] arr = new int[3][]; // decleration

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = in.nextInt();
            }

        }
        //ouput

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }




        }
}
