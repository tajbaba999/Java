import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(454);
        list.add(456);
        list.add(4545);
        list.add(92);

        System.out.println(list);
        System.out.println(list.contains(4545));
        list.set(2, 56);
        list.remove(1);
        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);



    }

    private void add(int i) {

    }
}
