import java.util.Arrays;
//https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
public class MinimumSum {
    public static void main(String[] args) {
        int num =2932;
        minimumSum(num);
    }
    public static void minimumSum(int num) {
        //2932
       int[] arr = new int[4];
       int curr=0;
       while (num > 0){
           arr[curr++] = num%10;
           num /= 10;
       }
        Arrays.sort(arr);
        int num1 = arr[0] *10 + arr[2];
        int num2 = arr[1] *10 + arr[3];
        System.out.println(num1+num2);
    }
}
