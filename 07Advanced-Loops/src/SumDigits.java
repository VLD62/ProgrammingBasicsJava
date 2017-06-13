import java.util.Scanner;

/**
 * Created by vld62 on 6/13/17.
 */
public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int sum = 0;
        do {
            int divN = n % 10;
            sum = sum  + divN;
            n = n / 10;
        } while (n != 0);

        System.out.println(sum);
    }
}
