public class IPCCERT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();
     /*  ArrayList<Integer> lsit = new ArrayList<>(4);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < list.length; i++) {
            sum = list[i];

        }*/

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
        }


    }
}
