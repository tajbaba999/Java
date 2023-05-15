import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(33);
        arr.add(32);
        arr.remove(2);

        arr.add(1,60);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        for (int i : arr){
            System.out.println(i);
        }

//        System.out.println(arr.get(2));
//        System.out.println(arr.size());
    }
}
