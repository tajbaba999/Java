import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2 ,7,11,15};
        int target = 9;
//        twoSum(arr, target);
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int temp=0;
        int[] arr = new int[2];
//        int n,m;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                temp=nums[i]+nums[j];
                if (temp == target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
