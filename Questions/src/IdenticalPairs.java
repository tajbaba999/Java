public class IdenticalPairs {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1,1,3};
        numIdenticalPairs(nums);

    }
    public static void numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i < j){
                    count++;
                }

            }

        }
        System.out.println(count);
    }
}
