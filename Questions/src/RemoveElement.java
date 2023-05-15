import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        removeElement(arr,val);
    }
    public static void removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if(val == nums[i]){
                nums[i] = Integer.parseInt(null);
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
