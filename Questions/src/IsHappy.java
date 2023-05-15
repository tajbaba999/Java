public class IsHappy {
    public static void main(String[] args) {
        int n = 2;
        isHappy(n);
    }
    public static void isHappy(int n) {
        int temp=0,ans=0;
        while (n>0){
            temp = n%10;
            ans+=temp*temp;
            if(ans==1){
                System.out.println("True");
                break;
            }
        }
        System.out.println("False");
    }
}
