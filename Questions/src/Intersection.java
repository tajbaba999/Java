import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        intersection(num1,num2);
    }

    public static void intersection(int[] nums1, int[] nums2) {
        //        Set<Integer> s = new HashSet<>();
        //
        //        for (int i = 0; i < nums1.length; i++) {
        //            for (int j = 0; j < nums2.length; j++) {
        //                if(nums1[i] == nums2[j]){
        //                    s.add(nums1[i]);
        //                }
        //            }
        //        }
        //        System.out.println(s);

            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> set2 = new HashSet<Integer>();
            for(int ele : nums1){
                    set1.add(ele);
            }
            for (int ele : nums2){
                set2.add(ele);
            }
            Set<Integer> insertation = new HashSet<Integer>(set1);
            insertation.retainAll(set2);
          int n = insertation.size();
          int[] arr = new int[n];
            int j =0;
            for(Integer i : insertation){
                arr[j++] = i;
            }
        System.out.println(Arrays.toString(arr));
    }
}
