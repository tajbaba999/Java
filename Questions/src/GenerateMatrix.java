import java.util.Arrays;

public class GenerateMatrix {
    public static void main(String[] args) {
        int n =2;
//        generateMatrix(n);
        System.out.println(Arrays.toString(generateMatrix(n)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] nums ={{1,2,3},{8,9,4},{7,6,5}};
        int[][] nums1= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                nums1[i][j]=nums[i][j];
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }
        return nums1;
    }
}
