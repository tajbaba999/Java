public class numpresent {
    public static void main(String[] args) {
        int arr[]={9, 8, 10};
        int x= 8;
        System.out.println(arr(arr,x));

    }
    public static boolean arr(int a[], int x){
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (x == a[i]){
                return true;
            }
        }
        return false;

    }
}
