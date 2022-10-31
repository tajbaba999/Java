import java.util.Scanner;

public class jeff {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Wnter the number");
//        int a= in.nextInt();
//        for (int i = 0; i < a; i++) {
//            System.out.print(i+"  ");

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the numbers :");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = a;
//        if (c > max){
//            max = c;
//        }
//        if (b > max){
//            max=b;
//        }
//        System.out.println("Maximum  "+ max);
//        String word = "Hello";
//        System.out.println(word.charAt(1));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println("The value is="+b);
    }

}
