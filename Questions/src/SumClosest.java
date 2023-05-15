import java.util.Arrays;

public class SumClosest {
    public static void main(String[] args) {
        int[] nums= {-1,2,1,-4};
        int target = 1;
        threeSumClosest(nums,target);
    }
    public static void threeSumClosest(int[] nums, int target) {
        //basic approach is select three elemensts from array sing nC3 apporach
        //and store in an array and itreate over the array
        int n = nums.length;
        int ncr = fact(n)/fact(n-3)*6;
        int arr[] = new int[ncr];
//        System.out.println(n);
        int l =0;
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                for (int k = j+1; k < nums.length-1; k++) {
                    arr[l++] = arr[i]+arr[j]+arr[k];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int fact(int n) {
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
