import java.util.Scanner;

/**
 * Created by viliev on 13.6.2017 г..
 */
public class Numbers1NwithStep3 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int n  = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n  ; i+=3) {
            System.out.println(i);
        }

    }
}
