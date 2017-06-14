import java.util.Scanner;

/**
 * Created by viliev on 14.6.2017 г..
 */
public class NumberTable {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n  = Integer.parseInt(in.nextLine());

        for (int row = 0; row < n ; row++) {

            for (int col = 0; col < n ; col++) {
                int num = row + col + 1;

                if (num > n) {
                    num = 2 * n - num;
                }
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}
