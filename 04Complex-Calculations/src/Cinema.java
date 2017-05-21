import java.util.Scanner;

/**
 * Created by vld62 on 5/21/17.
 */
public class Cinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        Double r = Double.parseDouble(in.nextLine());
        Double c = Double.parseDouble(in.nextLine());
        double price = 0;
            switch (type) {
                case "Premiere":
                    price = 12.00;
                    break;
                case "Normal":
                    price = 7.50;
                    break;
                case "Discount":
                    price = 5.00;
                    break;
            }
        System.out.printf("%.2f leva", r*c*price);
    }

}
