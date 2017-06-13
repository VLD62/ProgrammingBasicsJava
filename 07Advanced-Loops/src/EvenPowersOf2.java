import java.util.Scanner;

/**
 * Created by viliev on 13.6.2017 г..
 */
public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i <= n ; i++) {
            if (i%2==0) {
                System.out.println((int) Math.pow(2, i));
            }
        }
    }
}
