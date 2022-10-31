public class firstprogra {
    public static void main(String[] args) {
        int[] nums = {7, 8, 3, 5, 9, 12, 0, 3};
        int element = 90;
        System.out.println(linear(nums, element));

    }


    static boolean linear(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }

        }
    return false;
    }
}
