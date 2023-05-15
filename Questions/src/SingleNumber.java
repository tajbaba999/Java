import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums ={4,1,2,1,2};
     int ans =   singleNumber(nums);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
//        int[] num =  new int[nums.length/2 + 1];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            i++;
        }
        return nums[nums.length-1];
    }
}
