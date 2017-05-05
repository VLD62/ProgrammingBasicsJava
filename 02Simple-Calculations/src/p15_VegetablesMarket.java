import java.util.Scanner;

/**
 * Created by viliev on 5.5.2017 г..
 */
public class p15_VegetablesMarket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(in.nextLine());
        double fruitPrice  = Double.parseDouble(in.nextLine());
        int vegetableKg = Integer.parseInt(in.nextLine());
        int fruitKG = Integer.parseInt(in.nextLine());

        double vegetableIncome = vegetablePrice * vegetableKg;
        double furitIncome = fruitPrice * fruitKG;

        System.out.print((vegetableIncome+furitIncome)/1.94);

    }
}
