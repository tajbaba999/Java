public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr={-12, -6, -2, 0, 5, 6, 9, 17};
        int target = 9;
        int ans = order(arr, target);
        System.out.println(ans);

    }
    static int order(int[] arr, int target){


        int start = 0;
        int end = arr.length-1;

        // find wheather the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start )/2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if(target < arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid-1;
                }
                else  {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
    }


