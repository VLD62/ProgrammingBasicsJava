import java.util.Scanner;

/**
 * Created by vld62 on 4/29/17.
 */
public class p11_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd*1.79549;
        System.out.printf("%.2f BGN", bgn);
    }
}
