import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class OddEvenSum {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        DecimalFormat df = new DecimalFormat("#.00");

        for (int i = 0; i < n ; i++) {
            if (i % 2 == 0) {
                int num2 = Integer.parseInt(in.nextLine());
                evenSum = evenSum + num2;
            } else {
                int num1 = Integer.parseInt(in.nextLine());
                oddSum = oddSum + num1;

            }
        }

        if (Math.abs(oddSum-evenSum) == 0) {
            System.out.println("Yes Sum " + oddSum);
        } else {
            System.out.println("No Diff " + new DecimalFormat("#.##").format(Math.abs(oddSum-evenSum)));
        }
    }
}
