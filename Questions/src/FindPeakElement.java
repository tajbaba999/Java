public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
       int ans = findPeakElement(nums);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
    if(nums.length == 1)
        return 0;
    int n = nums.length;
    if(nums[0] > nums[1]) return 0;
    if(nums[n-1] > nums[n-2]) return n-1;
//    int start,end;
   int  start=1;
   int  end=nums.length-2;
    while (start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) return mid;
        else if (nums[mid] < nums[mid-1]) end = mid - 1;
        else if (nums[mid] > nums[mid+1]) start = mid + 1;
    }
    return -1;
    }
}
