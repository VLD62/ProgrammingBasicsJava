import java.util.Scanner;

/**
 * Created by viliev on 6.6.2017 г..
 */
public class TriangleDollars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= N ; i++) {
            System.out.println(strBuilder(i,"$ "));
        }

    }

    static String strBuilder (int count, String symbols) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            sb.append(symbols);
        }


        return sb.toString();
    }
}
