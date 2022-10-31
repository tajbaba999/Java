public class multpliaction {
    public static void main(String[] args) {
        System.out.println(mnmultipliacion(3,4));
    }
    public static int mnmultipliacion(int m, int n){
        if(m == 0 || n == 0){
            return 0;
        }
        int smalloutput = mnmultipliacion(m,n);
        return smalloutput * mnmultipliacion(m,n);
    }
}
