import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by viliev on 29.5.2017 г..
 */
public class SmartLilly {
    public static void main(String[] args) {
        double toyCount = 0, moneyCount = 0 , brotherCount = 0;
        int age1 = 0;
        Scanner in = new Scanner(System.in);
        int age = Integer.parseInt(in.nextLine());
        double finalPrice = Double.parseDouble(in.nextLine());
        double toyPrice = Double.parseDouble(in.nextLine());
        DecimalFormat df = new DecimalFormat("0.00");
        if (age % 2 == 0) {
            age1 = age;
        } else {
            age1 = age + 1;
        }

        for (int i = 1; i <= age ; i++) {
             if (age1 % 2 == 0) {
                 toyCount++;
                } else {
                moneyCount +=i*5;
                 brotherCount++;
             }
            age1 = age1 - 1;
        }
        if (finalPrice > ((moneyCount+toyCount*toyPrice)-brotherCount)) {
            System.out.println("No! "+ df.format(finalPrice - ((moneyCount+toyCount*toyPrice)-brotherCount)));
        } else {
            System.out.println("Yes! "+ df.format(((moneyCount+toyCount*toyPrice)-brotherCount) - finalPrice));
        }
    }
}
