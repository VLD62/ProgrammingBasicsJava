import java.util.Scanner;

/**
 * Created by vld62 on 6/3/17.
 */
public class RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int row = 0; row < n ; row++) {
            System.out.print("*");
            for (int col = 0; col < n - 1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
