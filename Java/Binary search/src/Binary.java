
import java.util.Arrays;
import java.util.Scanner;

public class Binary {

        public static void main(String[] args) {
            int[] arr={-12, -6, -2, 0, 5, 6, 9, 17};
            int target = 9;
            int ans = binarysearch(arr, target);
            System.out.println("Element is="+ans);

        }

    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while (start <= end){

            int mid = start + (end - start )/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start = mid+1;

            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
