public class CountPoints {
    public static void main(String[] args) {
        String str ="";
        countPoints(str);
        //B0B6G0R6R0R6G9
    }

    public static void countPoints(String rings) {
        for (int i = 0; i < rings.length(); i=+2) {
           char ch = rings.charAt(i);
           char chint = rings.charAt(i);
           if(ch == 'R' && ch == 'G' && ch == 'B'){
               polenumber(Integer.parseInt(String.valueOf(ch)), chint);
           }
        }
    }


     static void polenumber(int ch, char chint) {


    }


}
