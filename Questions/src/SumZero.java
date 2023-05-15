import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
//        sumZero(5);
        System.out.println(Arrays.toString(sumZero(4)));
    }
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int mid, setneg=-1,setpos=1;
        mid = n/2;
        if(n%2 != 0){
//            mid = n/2;
            System.out.println(mid);
//            mid = mid +1;
            arr[mid] = 0;
            System.out.println(arr[mid]);
            for (int i = mid-1; i >= 0; i--) {
                arr[i]=setneg;
                setneg--;
            }
            System.out.println(Arrays.toString(arr));
            for (int i = mid+1; i < n; i++) {
                arr[i]=setpos;
                setpos++;
            }
            System.out.println(Arrays.toString(arr));
        }else {

            for (int i = mid-1; i >= 0; i++) {
                arr[i]=setneg;
                setneg--;
            }
            for (int i = mid; i < n; i++) {
                arr[i]=setpos;
                setpos++;
            }

        }
        return arr;
    }
}
