public class minimum {
    public static void main(String[] args) {
        int[] arr ={20, 7, 1, -4, 2};
        System.out.println(mini(arr));
    }
    static int  mini(int[] nums){
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < ans){
                ans = nums[i];
            }
        }
        return ans;
    }
}

