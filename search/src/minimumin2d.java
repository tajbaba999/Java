import java.util.Arrays;

public class minimumin2d {
    public static void main(String[] args) {
        int[][] arr={
                {2, 4, 6, 90},
        { 6, 8, 3, 19, 45},
        {7, 34, 75, 89},
        {87, 33},

        };

        int target = 88;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int arr[][],int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }

            }

        }
        return new int[] {-1, -1};
    }
}
