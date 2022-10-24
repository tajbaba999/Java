import java.util.Arrays;

public class Maximunsum {
    public static void main(String[] args) {
        int[] nums={-100,-98,-1,2,3,4};
      int answer =  maximumProduct(nums);
        System.out.println(answer);
    }

    static int maximumProduct(int[] nums) {
        int product;
        Arrays.sort(nums);
        product=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        return product;
    }
}
