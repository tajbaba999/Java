public class StringsAreEqual {
    public static void main(String[] args) {
        String[] word1= {"ab", "c"};
        String[] word2= {"a", "bc"};
        arrayStringsAreEqual(word1,word2);
     }
    public static void arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer w1 = new StringBuffer();
        StringBuffer w2 = new StringBuffer();
        for (int i = 0; i < word1.length; i++) {
            w1.append(word1[i]);
//            w2.append(word2[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            w2.append(word2[i]);
        }
        System.out.println(w1);
//        String str = w1.toString();
        System.out.println(w2);

//            System.out.println(w1.equals(w2));
        System.out.println(w2.equals(w1));
    }
}
