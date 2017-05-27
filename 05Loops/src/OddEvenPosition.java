import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class OddEvenPosition {
    public static void main(String[] args) {
        double oddSum = 0;
        double oddMax = Double.MAX_VALUE*(-1);
        double oddMin = Double.MAX_VALUE;
        double evenSum = 0;
        double evenMax = Double.MAX_VALUE*(-1);
        double evenMin = Double.MAX_VALUE;
        DecimalFormat df = new DecimalFormat("###.##");
        Scanner in = new Scanner(System.in);
        double n = Double.parseDouble(in.nextLine());

        for (double i = 1; i <= n ; i++) {
            double num = Double.parseDouble(in.nextLine());
            if (i % 2 == 0) { // Even

                evenSum = evenSum + num;
                if (num > evenMax ){
                    evenMax = num;
                }

                if (num < evenMin) {
                    evenMin = num;
                }

            } else {           //Odd

                oddSum = oddSum + num;
                if (num > oddMax ){
                    oddMax = num;
                }

                if (num < oddMin) {
                    oddMin = num;
                }

            }
        }


        System.out.println("OddSum="+df.format(oddSum));
        if (oddMin == Double.MAX_VALUE) {
            System.out.println("OddMin=no");
        } else {
            System.out.println("OddMin="+df.format(oddMin));
        }
        if (oddMax ==  Double.MAX_VALUE*(-1)) {
            System.out.println("OddMax=no");
        } else {
            System.out.println("OddMax="+df.format(oddMax));
        }
        System.out.println("EvenSum="+df.format(evenSum));
        if (evenMin ==  Double.MAX_VALUE) {
            System.out.println("EvenMin=no");
        } else {
            System.out.println("EvenMin="+df.format(evenMin));
        }
        if (evenMax ==  Double.MAX_VALUE*(-1)) {
            System.out.println("EvenMax=no");
        } else {
            System.out.println("EvenMax="+df.format(evenMax));
        }



    }
}
