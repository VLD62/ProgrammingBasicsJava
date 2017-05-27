import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class Histogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        DecimalFormat df = new DecimalFormat("#.##");
        double p1 = 0, p2 = 0, p3 = 0 , p4 = 0, p5 = 0;
        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(in.nextLine());
            if (num < 200) {
                p1++;
            } else if (num >= 200 && num <= 399) {
                p2++;
            } else if (num >= 400 && num <= 599) {
                p3++;
            } else if (num >= 600 && num <= 799) {
                p4++;
            } else if (num >= 800) {
                p5++;
            }


        }
        System.out.println(df.format(p1/n*100)+"%");
        System.out.println(df.format(p2/n*100)+"%");
        System.out.println(df.format(p3/n*100)+"%");
        System.out.println(df.format(p4/n*100)+"%");
        System.out.println(df.format(p5/n*100)+"%");
    }
}
