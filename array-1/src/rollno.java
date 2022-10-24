public class rollno {
    public static void main(String[] args) {
        int[] rnos = new int[5];
        // or this type of declartion either both
        int[] rons1 = {45, 78, 34, 12, 56};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);
        // delaration of string
        String[] arr = new String[4];
        System.out.println(arr[3]);
    }
}
