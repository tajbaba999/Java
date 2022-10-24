import java.util.Scanner;
import java.util.Arrays;

public class TSTROBOT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=0, count=0,j=0;
        String str;
        int x = in.nextInt();
        str = in.next();
        char[] ch = new char[str.length()];
        int[] arr1 = new int[str.length()];
        int[] temp = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i]=str.charAt(i);

        }
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]!='L'){
                x++;
                arr1[i]=x;

            }
            else{
                x--;
                arr1[i]=x;
            }

        }
      System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        for (int i = 1; i < arr1.length ; i++){
            if (arr1[i-1] != arr1[i]){
                temp[j++] = arr1[i];
            }
            else {
                 int st = arr1[i];
            }


        }
        System.out.println(Arrays.toString(temp));

//        for (int j = 0; j < arr1.length; j++){
//            for (int l = 1; l < j; l++) {
//                if (arr1[j]==arr1[l]){
//                    count++;
//                }
//            }


     //   System.out.println(count);




    }
}

