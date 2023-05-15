public class JewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
            numJewelsInStones(jewels,stones);
    }
    public static void numJewelsInStones(String jewels, String stones) {
        int count =0;
        for (int i = 0; i <stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if(stones.charAt(i) == jewels.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("Count = "+count);
    }
}
