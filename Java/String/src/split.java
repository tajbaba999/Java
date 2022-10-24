public class split {
    public static void main(String[] args) {
        String s="(()())(())";
        balancedStringSplit(s);
    }


        static int balancedStringSplit(String s) {
            String s1;
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i) == '('){
                    if(s.charAt(i+1)== ')' ){
                       // s1 = String.valueOf(s.charAt(i) + String.valueOf(s.charAt(i+1);
                    }
                }
            }
           // StringBuilder sb = new StringBuilder();
           // String sb = s.toLowerCase();
            System.out.println(s);
        return 1;
    }
}
