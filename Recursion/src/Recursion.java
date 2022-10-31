public class Recursion {
    public static void main(String[] args) {
        System.out.println(sumn(4));
    }
    public static int sumn(int n){
        if(n == 0){
            return 0;
        }
        int smlloutput = sumn(n-1);
        int output = n + smlloutput;
        return output;
    }
}
