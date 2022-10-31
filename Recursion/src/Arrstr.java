public class Arrstr {
    public static String replace(String s, char a, char b){
        if(s.length() == 0){
            return s;
        }
        String smalloutput = replace(s.substring(1), a, b);
        if (s.charAt(0)== a){
            return b + smalloutput;
        }else {
            return s.charAt(0) + smalloutput;
        }
    }

    public static void main(String[] args) {
        System.out.println(replace("abcxdxex",'x','y'));
    }

}
