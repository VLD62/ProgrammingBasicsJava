import java.util.Scanner;

/**
 * Created by viliev on 8.6.2017 г..
 */
public class ChristmasTree2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int counter = n;

        System.out.println(strBuilder(n," ") + " | ");
        for (int i = 1; i <= n ; i++) {
            counter--;

            String leftSide = strBuilder(counter, " ") + strBuilder(i, "*");
            String middleSide =" | ";
            String rightSide = strBuilder(i, "*") + strBuilder(i," ");
            System.out.println(leftSide + middleSide + rightSide);

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
