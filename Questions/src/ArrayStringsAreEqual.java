public class ArrayStringsAreEqual {
    public static void main(String[] args) {
    String[] word1 ={"ab", "c"};
    String[] word2 = {"a", "bc"};
    arrayStringsAreEqual(word1,word2);
    }
    public static void arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wo1 = new StringBuilder("");
        StringBuilder wo2 = new StringBuilder("");
        for (String s:word1){
            wo1.append(s);
        }
        for (String s : word2){
            wo2.append(s);
        }
        System.out.println( wo1.toString().equals(wo2.toString()));

    }
}
