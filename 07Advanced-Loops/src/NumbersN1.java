import java.util.Scanner;

/**
 * Created by viliev on 13.6.2017 г..
 */
public class NumbersN1 {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int n  = Integer.parseInt(in.nextLine());

        for (int i = n; i >= 1  ; i--) {
            System.out.println(i);
        }

    }
}
