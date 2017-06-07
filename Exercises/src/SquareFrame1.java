import java.util.Scanner;

/**
 * Created by viliev on 6.6.2017 г..
 */
public class SquareFrame1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        System.out.println("+ "+strBuilder(n-2,"- ")+"+");
        for (int i = 0; i < n -2 ; i++) {
            System.out.println("| "+strBuilder(n-2,"- ")+"|");
        }
        System.out.println("+ "+strBuilder(n-2,"- ")+"+");
    }

    static String strBuilder (int count, String symbols) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            sb.append(symbols);
        }

        return sb.toString();
    }
}
