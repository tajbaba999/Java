import java.util.Scanner;

public class switchu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word");
        String n = in.next();


        switch (n) {
            case "Taj" -> System.out.println("TAJ BABA");
            case "Ni" -> System.out.println("NIKHEL");
            case "Vi" -> System.out.println("VIAKS #Baa");
            default -> System.out.println("NO ANY ONE");

        }
    }
}
