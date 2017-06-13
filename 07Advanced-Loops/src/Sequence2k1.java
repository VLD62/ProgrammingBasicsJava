import java.util.Scanner;

/**
 * Created by viliev on 13.6.2017 г..
 */
public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int num = 1;

        while (num <= n ) {
            System.out.println(num);
            num = num * 2 + 1;
        }

    }
}
