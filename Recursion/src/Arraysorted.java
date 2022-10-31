public class Arraysorted {
    public static void main(String[] args) {

    }
    public static boolean issorted(int a[]){
        if(a.length == 1){
            return true;
        }
        if (a[0] > a[1]){
            return false;
        }
        int smallArray[] = new int[a.length-1];
        for (int i = 1; i < a.length; i++) {
            smallArray[i-1] = a[i];
        }
        boolean issmallarrysorted = issorted(smallArray);
        return issmallarrysorted;
    }
}
