public class StringSplit {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        balancedStringSplit(s);
    }

    public static void balancedStringSplit(String s) {
        //RLRRRLLRLL
        int pointer = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L'){
                pointer++;
            }else {
                pointer--;
            }
            if(pointer == 0){
                count++;
            }

        }
        System.out.println(count);
    }
}
