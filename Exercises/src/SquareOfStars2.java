import java.util.Scanner;

/**
 * Created by viliev on 6.6.2017 г..
 */
public class SquareOfStars2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        for (int i = 0; i < N ; i++) {
            System.out.println(strBuilder(N,"* "));
        }

    }

    static String strBuilder (int count, String symbols) {
        StringBuilder builder =  new StringBuilder();
        for (int i = 0; i < count ; i++) {
            builder.append(symbols);
        }
        return builder.toString();
    }
}
