
public class Reverse {
    public static void main(String[] args) {
        int ans =0;
//                reverse(-123);
                ;
        System.out.println(reverse1(1534236469));
//        System.out.println(ans);
    }
//
//    public static int reverse(int x) {
//        int ans=0,finalans=0;
//        if(x>0){
//            while (x!=0){
//                int remainder = x%10;
//                ans = ans *10 + remainder;
//                x=x/10;
//            }
//        finalans = ans;
//       }else {
////            while ()
//
//       }
//
//
//
//    }
    public static int reverse1(int x){
        int  ans = 0,finalans;
        if(x>= Integer.MAX_VALUE || x<=Integer.MIN_VALUE){
            finalans=ans;
        }else{
            while (x!=0){
                int remainder = x%10;
                ans = ans *10 + remainder;
                x=x/10;
            }
            finalans=ans;
        }
//        System.out.println(ans);
        return finalans;
    }
}
