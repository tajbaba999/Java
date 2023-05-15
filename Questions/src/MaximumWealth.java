public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        maximumWealth(arr);
    }

    public static void maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for(int i=0; i<accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];

            }
            max= Math.max(sum,max);
        }
        System.out.println(max);
    }


}
