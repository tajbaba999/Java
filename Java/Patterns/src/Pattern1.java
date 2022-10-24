public class Pattern1 {
    public static void main(String[] args) {
     //  pattern(5);
       // pattern2(5);
        pattern6(5);
    }

    static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int toatlcolsinrow = row > n ? 2 * n - row : row;
            for (int col = 0; col < toatlcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
            }

        }

    
//    static void pattern5(int n){
//        for (int i = 0; i < 2 * n; i++) {
//            int c =
//            for (int j = 0; j < ; j++) {
//
//            }
//        }
//    }

    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
