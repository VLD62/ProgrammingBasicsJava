import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class SmallShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product = in.nextLine().toUpperCase();
        String city    = in.nextLine().toUpperCase();
        Double quantity = Double.parseDouble(in.nextLine());

        if (city.equals("SOFIA")) {
            if (product.equals("COFFEE")) {
                System.out.println(0.50*quantity);
            } else if (product.equals("WATER")) {
                System.out.println(0.80*quantity);
            } else if (product.equals("BEER")) {
                System.out.println(1.20*quantity);
            } else if (product.equals("SWEETS")) {
                System.out.println(1.45*quantity);
            } else if (product.equals("PEANUTS")){
                System.out.println(1.6*quantity);
            }

        } else if (city.equals("PLOVDIV")) {
            if (product.equals("COFFEE")) {
                System.out.println(0.40*quantity);
            } else if (product.equals("WATER")) {
                System.out.println(0.70*quantity);
            } else if (product.equals("BEER")) {
                System.out.println(1.15*quantity);
            } else if (product.equals("SWEETS")) {
                System.out.println(1.30*quantity);
            } else if (product.equals("PEANUTS")){
                System.out.println(1.50*quantity);
            }
        } else if (city.equals("VARNA")){
            if (product.equals("COFFEE")) {
                System.out.println(0.45*quantity);
            } else if (product.equals("WATER")) {
                System.out.println(0.70*quantity);
            } else if (product.equals("BEER")) {
                System.out.println(1.10*quantity);
            } else if (product.equals("SWEETS")) {
                System.out.println(1.35*quantity);
            } else if (product.equals("PEANUTS")){
                System.out.println(1.55*quantity);
            }
        }

    }
}
