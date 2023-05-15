public class Maximum69Number {
    public static void main(String[] args) {
        int num =9669;
       int ans = maximum69Number(num);
        System.out.println("Ans "+ans);
    }

    public static int maximum69Number (int num) {
       char[] arr = (num+"").toCharArray();
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '6'){
                    arr[i] = '9';
                    break;
                }
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}
