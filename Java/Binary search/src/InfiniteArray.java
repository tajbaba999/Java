public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 12, 14, 23, 32, 33, 35};
        int target=35;
        System.out.println(ans(arr, target));

    }
    static int ans(int[] arr, int target) {
        // find the range
        //first start with a box of sixe 2
        int start = 0;
        int end = 1;
        //condition start < target > end
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysearch(arr, target, start, end);
    }

        static int binarysearch(int[] arr, int target, int start, int end) {


            while(start <= end){

                int  mid = start + (end-start)/2;

                if(target < arr[mid] ){
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
