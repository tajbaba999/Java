public class plindrome {
    public static void main(String[] args) {
        System.out.println(series("racecar"));
    }
    public static boolean series(String s){
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
       // int i=0;
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return series(s.substring(1,s.length()-1));
        }

        else {
            return false;
        }
    }
}
