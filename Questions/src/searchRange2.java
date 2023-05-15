import java.util.Arrays;

import static java.nio.file.Files.find;

public class searchRange2 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target= 6;
//        System.out.println(searchRange(nums,target));
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int n = nums.length;

        int index = find(nums,0,n-1,target);
        if (index!=-1){

            ans[0] = index;
            ans[1] = index;

            while (index-1 >=0 && nums[index-1]==target){
                ans[0]=--index;
            }
            while (index+1 < n && nums[index+1] ==target ){
                ans[1]=++index;
            }

        }
        return ans;
    }

    private static int find(int[] nums, int start, int end, int target) {
        while (start <= end){
            int mid = (start + end )/2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                find(nums, mid+1, end,target);
            }else {
                find(nums,start,mid-1,target);
            }
        }
    return -1;
    }
}
