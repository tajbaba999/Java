import java.util.ArrayList;

public class operators {

    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));// casting

        System.out.println("a"+1);
        //integer wille be converted to integer that will call toString()
        //this is same as after a few steps:"a" + "1"

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

    }
}
