import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        restoreString(s,indices);

    }

    static String restoreString(String s, int[] indices) {
        System.out.println(s);
        System.out.println(Arrays.toString(indices));
        int i=0;
        int j=0;
        char[] astr = new char[34];
       while (indices[i]!=j){
           if(indices[i] == j){
               j++;
           }
           else {
               i++;
           }
           astr = s.charAt(i);
       }
        System.out.println(astr);

    return s;
    }
}
