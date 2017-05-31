import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by viliev on 31.5.2017 г..
 */
public class OperationsWithNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int N1 = Integer.parseInt(in.nextLine());
        int N2 = Integer.parseInt(in.nextLine());
        int total = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        String operator = in.nextLine();

        switch (operator){
            case "+":
                total = N1+N2;
                if (total%2==0) {
                    System.out.println(N1 + " + " + N2 + " = " + total + " - even");
                } else {
                    System.out.println(N1 + " + " + N2 + " = " + total + " - odd");
                }
                break;
            case "-":
                total = N1-N2;
                if (total%2==0) {
                    System.out.println(N1 + " - " + N2 + " = " + total + " - even");
                } else {
                    System.out.println(N1 + " - " + N2 + " = " + total + " - odd");
                }
                break;
            case "*":
                total = N1*N2;
                if (total%2==0) {
                    System.out.println(N1 + " * " + N2 + " = " + total + " - even");
                } else {
                    System.out.println(N1 + " * " + N2 + " = " + total + " - odd");
                }
                break;
            case "/":
                if (N2 == 0) {
                    System.out.println("Cannot divide " + N1 + " by zero");
                } else {
                    double total1 = (double)N1/(double)N2;
                    System.out.println(N1 + " / " + N2 + " = " + df.format(total1));
                }
                break;
            case "%":
                if (N2 == 0) {
                    System.out.println("Cannot divide " + N1 + " by zero");
                } else {
                    total = N1%N2;
                    System.out.println(N1 + " % " + N2 + " = " + total);
                }
                break;
        }

    }

}
