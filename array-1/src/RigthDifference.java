import java.util.Arrays;

public class RigthDifference {

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
//        leftRigthDifference(nums);
        System.out.println(Arrays.toString(leftRigthDifference(nums)));
    }

    public static int[] leftRigthDifference(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] arr3 = new int[nums.length];
        int  leftsum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = leftsum;
            leftsum += nums[i];
        }
        int rightsum=0;
        for (int i = nums.length-1; i >= 0; i--) {
           arr2[i] = rightsum;
           rightsum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
           arr3[i] =  Math.abs(arr1[i]-arr2[i]);
        }
      return arr3;
    }
}

//[0,10,14,22]
//[15,11,3,0]