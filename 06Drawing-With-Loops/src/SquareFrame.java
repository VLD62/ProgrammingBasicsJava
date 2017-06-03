import java.util.Scanner;

/**
 * Created by vld62 on 6/3/17.
 */
public class SquareFrame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
// TODO: Print the top row: + - - - +
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
// TODO: print the mid rows: | - - - |
        for (int j = 0; j < n - 2 ; j++) {
        System.out.print("|");
            for (int i = 0; i < n - 2; i++) {
                System.out.print(" -");
            }
        System.out.println(" |");
    }

// TODO: print the bottom row: + - - - +
        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");

    }
}
