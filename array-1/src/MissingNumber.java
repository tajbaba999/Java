public class MissingNumber {

    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int missing = 5;
       int ans = MissingNumber1(arr, missing);
        System.out.println(ans);
    }
    static int MissingNumber1(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for(int ans : array){
            sum += ans;
        }
        System.out.println("sum : "+sum);
        int missingnum = n*(n+1)/2 - sum ;
        System.out.println("Missing sum : "+missingnum);
        return missingnum;
    }
}
