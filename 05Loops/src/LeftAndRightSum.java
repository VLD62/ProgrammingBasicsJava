import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class LeftAndRightSum {
    public static void main(String[] args) {
        double leftSum = 0;
        double rightSum = 0;
        Scanner in = new Scanner(System.in);
        double n = Double.parseDouble(in.nextLine());
        DecimalFormat df = new DecimalFormat("#.00");


        for (double i = 0; i < n ; i++) {
            double num1 = Integer.parseInt(in.nextLine());
            leftSum = leftSum + num1;

        }

        for (double i = 0; i < n; i++) {
            double num2 = Integer.parseInt(in.nextLine());
            rightSum = rightSum + num2;
        }

        if (Math.abs(leftSum-rightSum) == 0) {
            System.out.println("Yes, sum " + leftSum);
        } else {
            System.out.println("No, diff " + new DecimalFormat("#.##").format(Math.abs(leftSum-rightSum)));
        }
    }
}
