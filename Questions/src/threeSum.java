import java.util.Arrays;

public class threeSum {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 2;
         threeSumClosest(nums,target);
//        System.out.println(ans);
    }
    public static void threeSumClosest(int[] nums, int target) {
            int len = nums.length;
            int ans = 0;
            int[] sumarr = new int[nums.length-2];
        for (int  i = 0; i < nums.length-2; i++) {
            sumarr[i] =  nums[i] + nums[i+1] + nums[i+2];
//            (nums[i])+(nums[i+1])+(nums[i+2])  = sumarr[i];
        }
//        for (int j = 0; j <sumarr.length; j++) {
//            System.out.println(sumarr[j]);
//
//        }
//                    System.out.println(sumarr.length);
        System.out.println(Arrays.toString(sumarr));

    }
}
