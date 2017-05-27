import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");
        double p1 = 0, p2 = 0, p3 = 0 , p4 = 0, p5 = 0;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(in.nextLine());
            if (num % 2 == 0) {
                p1++;
            }
            if (num % 3 == 0) {
                p2++;
            }
            if (num % 4 == 0) {
                p3++;
            }


        }
        System.out.println(df.format(p1/n*100)+"%");
        System.out.println(df.format(p2/n*100)+"%");
        System.out.println(df.format(p3/n*100)+"%");

    }
}
