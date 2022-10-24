import java.util.Arrays;

public class frequency {

    public static void main(String[] args) {
        int[] nums={-1,1,-6,4,5,-6,1,4,1};
        frequencySort(nums);
    }

    static int[] frequencySort(int[] nums) {

        int j=0,count=0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(nums[j]==nums[j+1]){
            count++;
            if(j<nums.length){
                j++;

            }
        }


        return new int[] {4};
    }

}
