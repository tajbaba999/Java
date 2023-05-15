public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2 ,7,11,15};
        int target = 9;
        twoSum(arr, target);
    }
    public static void twoSum(int[] nums, int target) {
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                temp=nums[i]+nums[j];
                if (temp == target){
                    System.out.println("one"+i+"two"+j);
                    break;
                }
            }
        }
    }
}
