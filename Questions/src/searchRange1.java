import java.util.Arrays;

public class searchRange1 {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target= 6;
//        System.out.println(searchRange(nums,target));
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = findstartingindex(nums,target);
    result[1] = findendingindex(nums,target);
    return result;
     }

    private static int findendingindex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] >= target){
                end = mid + 1;
            }else {
                start = mid + 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }

    private static int findstartingindex(int[] nums, int target) {
       int index = -1;

       int start = 0;
       int end = nums.length-1;

       while (start <= end){
           int mid = start + (end -start)/2;
           if(nums[mid] <= target){
               start = mid+1;
           }else {
               end = mid-1;
           }
           if(nums[mid] == target) index = mid;
       }
       return index;
    }

//    private static void sendnew(int mid) {
//        System.out.println(mid);
//    }
}
