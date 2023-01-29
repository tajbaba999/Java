import java.util.Arrays;

public class findMedianSorted {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {4,3};
       double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans=0.0000;
        int nums1len = nums1.length;
        int nums2len = nums2.length;
        int[] median = new int[nums1len+nums2len];
        int pos=0;
        for(int element : nums1){
            median[pos] = element;
            pos++;
        }
        for (int element : nums2){
            median[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(median));
        for(int i=0; i<median.length; i++){
            for(int j=i+1; j<median.length; j++){
                int temp = 0;
                if(median[i] > median[j]){

                    temp=median[i];
                    median[i]=median[j];
                    median[j]=temp;
                }
            }
//            System.out.println(median[i] + " ");
        }
        System.out.println(Arrays.toString(median));
        int len = median.length;
        System.out.println(len);
        if(median.length %2 == 0 ){
            int l = median.length /2;
//            len=len/2;
//            len= len-1;
//            System.out.println(len);
//            int floor = (int)Math.floor(len);
//            int ceil = (int)Math.ceil(len);
//            System.out.println(floor);
//            System.out.println(ceil);
                double sum = median[l] + median[l-1];
                ans = sum /2.00;

        }else {
            len=len/2;
             ans = median[len];
        }
        return ans;
    }
}
