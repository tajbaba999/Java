public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int mid,low=0,high= nums.length-1;
        while (low<=high){
            mid =  (high+low)/2;
            if(target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            }else {
                high = mid -1;
            }
        }
        return -1;
    }
}
