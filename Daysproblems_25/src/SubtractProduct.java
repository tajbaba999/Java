public class SubtractProduct {

    public static void main(String[] args) {
        int n = 234;
        int ans = subtractProductAndSum(n);
        System.out.println(ans);
    }
    public static int subtractProductAndSum(int n) {
        int temp,sum=0,product=1;
        while (n>0){
            temp = n%10;
            sum += temp;
            product = product*temp;
            n=n/10;
        }
       return product-sum; int temp,sum=0,product=1;
        while (n>0){
            temp = n%10;
            sum += temp;
            product = product*temp;
            n=n/10;
        }
        return product-sum;

    }
}
