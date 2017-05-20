import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class TradeComissions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String city   = in.nextLine().toLowerCase();
        Double trades = Double.parseDouble(in.nextLine());
        double commission = -1;
        double s;

        if ((trades >= 0 && city.equals("sofia")) || (trades >= 0 && city.equals("plovdiv"))
                || (trades >= 0 && city.equals("varna"))) {
            if (city.equals("sofia")) {
                if (0 <= trades && trades <=500) {
                    s = 5;
                } else if (500 <= trades && trades <=1000) {
                    s = 7;
                } else if (1000 <= trades && trades <=10000) {
                    s = 8;
                } else {
                    s = 12;
                }
            } else if (city.equals("plovdiv")) {
                if (0 <= trades && trades <=500) {
                    s = 5.5;
                } else if (500 <= trades && trades <=1000) {
                    s = 8;
                } else if (1000 <= trades && trades <=10000) {
                    s = 12;
                } else {
                    s = 14.5;
                }
            } else {
                if (0 <= trades && trades <=500) {
                    s = 4.5;
                } else if (500 <= trades && trades <=1000) {
                    s = 7.5;
                } else if (1000 <= trades && trades <=10000) {
                    s = 10;
                } else {
                    s = 13;
                }

            }
            commission = (s/100)*trades;
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }

    }
}
