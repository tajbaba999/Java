

public class removeElemente {
    public static void main(String[] args) {
        int[] nums ={3,2,2,3};
        int val = 3;
       int k = removeElement(nums,val);
        System.out.println(k);

    }
    public static int removeElement(int[] nums, int val){
        int count =0;
//        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (val == nums[i]){
                nums[i] = '\0';
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!='\0'){
                count++;
            }
        }
        return count;
        
    }
}
