import java.util.Scanner;

/**
 * Created by viliev on 13.6.2017 г..
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());

        while (b != 0) {
            int oldB = b;
            b = a % b;
            a = oldB;
        }

        System.out.println(a);
    }
}
