import java.util.Arrays;

public class Maximum_Product {
    public static void main(String[] args) {
        int[] nums= {3,7};
        int output = maxProduct(nums);
        System.out.println(output);
     }
    static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max1=nums[nums.length-1]-1;
        int max2=nums[nums.length-2]-1;

        int out = max1*max2;

        return out;

    }
}
