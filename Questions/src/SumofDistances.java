import java.util.Arrays;

public class SumofDistances {
    public static void main(String[] args) {
        int[] nums= {1,3,1,1,2};
        distance(nums);
    }

    public static void distance(int[] nums) {
        //1,3,1,1,2
        //[5,0,3,4,0]
//        int k=0;
        long[] arr = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && j!=i; j++) {
                if (nums[i] == nums[j]){
                    arr[i++]=+Math.abs(i-j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
