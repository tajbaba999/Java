import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4,3,2,1};
        int n=4;
        System.out.println(Arrays.toString(shuffle(nums,n)));

    }
    public static int[] shuffle(int[] nums, int n) {
       int newlist[] = new int[nums.length];
       int x=0; int y=n;
        for (int i = 0; i < nums.length; i+=2) {
            newlist[i]=nums[x];
            newlist[i+1]=nums[y];
            x++;
            y++;
        }

    return newlist;

    }
}
