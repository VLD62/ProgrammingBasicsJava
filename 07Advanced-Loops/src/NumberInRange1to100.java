import java.util.Scanner;

/**
 * Created by viliev on 13.6.2017 г..
 */
public class NumberInRange1to100 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n  = Integer.parseInt(in.nextLine());

        while (n < 1 || n > 100 ) {
            System.out.println("Invalid number!");
            n  = Integer.parseInt(in.nextLine());
        }
        System.out.println(n);
    }
}
