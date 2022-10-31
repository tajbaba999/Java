public class Multiplicationrecu {
    public static void main(String[] args) {
        System.out.println(mumltplicataion(153));
    }
    public static int mumltplicataion(int n){
        if(n == 0){
            return 0;
        }
        int smllout=0;
        System.out.println(smllout);
        smllout = mumltplicataion(n/10);

        return smllout * n%10;

       // return 10;
    }
}
