public class leetcodesqrt {
    public static void main(String[] args) {
        int x = 4;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        int root;
        root = (x - ((x*x)-x)/2*x);
    return root;
    }
}
