public class stringsearch {
    public static void main(String[] args) {
        String name = "Tasleem";
        char ch = 'a';
        System.out.println(search(name, ch));
    }
    static boolean search(String word, char ch){
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)){
                return true;
            }

        }
      return false;
    }
}
