import java.sql.SQLOutput;
import java.util.Arrays;

public class varargu {
    public static void main(String[] args) {
        fun(2, 4, 8, 9, 5);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}