import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr ={2, 6, 78, 3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
       // System.out.println(max(arr));

    }
    static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while (start < end)
        {

            start++;
            end--;
        }
    }
//    static int max(int[] arr)
//    {
//        int maxval = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maxval)
//            {
//                maxval = arr[i];
//            }
//        }
//        return maxval;
//    }
}