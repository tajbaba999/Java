import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
//        plusOne(digits);
        System.out.println(Arrays.toString(plusOne(digits)));

    }
    public static int[] plusOne(int[] digits) {
//        int count=0,ansstore;
//         double ans = 0;
//        for (int i = 0; i < digits.length; i++) {
//            ans = ans * 10 + digits[i];
//        }
//        System.out.println(ans);
//            ansstore = ans + 1;
//            int ansvalue = ansstore;
//            while (ansstore!=0){
//                ansstore= ansstore/10;
//                count=count+1;
//
//            }
//        System.out.println(count);
//        int[] value = new int[count];
//        System.out.println(ansstore);
//        System.out.println(ansvalue);
//        for (int i = count-1; i >= 0; i--) {
//            value[i] = ansvalue%10;
//            ansvalue=ansvalue/10;
//
//        }
//        System.out.println(Arrays.toString(value));
//        int count = 0;
//        long ans=0;
//        long ansstore;
//        for (int i = 0; i < digits.length; i++) {
//            ans = ans * 10 + digits[i];
//        }
//        System.out.println(ans);
//        ansstore = ans + 1;
//        System.out.println(ansstore);
//        long ansvalue =  ansstore;
//        while (ansstore != 0) {
//            ansstore = ansstore / 10;
//            count = count + 1;
//
//        }
//        System.out.println(count);
//        int[] value = new int[count];
//        for (int i = count - 1; i >= 0; i--) {
//            System.out.println(ansvalue);
//            value[i] = (int) ansvalue % 10;
//            System.out.println(value[i]);
//            ansvalue = ansvalue / 10;
//
//
//        }
//
//        System.out.println(Arrays.toString(value));
//        return value;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
