public class MaximumCount {
    public static void main(String[] args) {
        int[] nums ={-3,-2,-1,0,0,1,2};
        maximumCount(nums);
    }
    public static void maximumCount(int[] nums) {
        int pos=0, neg=0;
        for(int num : nums) {
         if(num > 0){
             pos++;
         } else if (num < 0) {
             neg++;
         }
        }
        if(pos > neg){
            System.out.println("Answer pos="+pos);
        }
        else {
            System.out.println("Answer  neg = "+neg);
        }
    }
}
