import java.util.Arrays;

public class celsius {
    public static void main(String[] args) {
        double cle = 36.50;
//        convertTemperature(cle);
        System.out.println(Arrays.toString(convertTemperature(cle)));
    }
    public static double[] convertTemperature(double celsius) {
        double far,kel;
        far= (celsius * 9/5 )+ 32;
        kel = celsius + 273.15;

        return new double[]{kel,far};
    }
}
