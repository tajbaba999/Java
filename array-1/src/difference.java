public class difference {
    public static void main(String[] args) {
        int[] nums ={1,15,6,3};
        differenceOfSum(nums);

    }

    public static void differenceOfSum(int[] nums) {
        int elementsum =0;
        int digitsum = 0;
        for (int ele : nums){
            elementsum+=ele;
            while (ele>=0){
                digitsum+=ele%10;
                ele/=10;
            }
        }
        System.out.println(digitsum);
        System.out.println(digitsum);
    }
}
