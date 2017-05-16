import java.util.Scanner;

/**
 * Created by viliev on 15.5.2017 г..
 */
public class TransportPrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String period = in.nextLine();
        double totalCost = 0;
        if (n > 0 && n <= 5000) {
            if (n < 20) {
                if (period.equals("day")) {
                    totalCost = 0.7+0.79*n;
                } else if (period.equals("night")) {
                    totalCost = 0.7+0.90*n;
                } else {
                    System.out.println("unknown period");
                }
            } else {
                if (n < 100) {
                    totalCost = 0.09*n;
                } else {
                    totalCost = 0.06*n;
                }
            }
            System.out.printf("%.2f",totalCost);

        } else {
            System.out.println("Distance can be between 0 and 5000 km only!");
        }
    }
}
