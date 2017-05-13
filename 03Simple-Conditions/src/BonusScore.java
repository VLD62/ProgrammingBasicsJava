import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class BonusScore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = Double.parseDouble(in.nextLine());
        double bonus = 0;
        if (num <= 100) {
            bonus = bonus+5;
        } else {
            if (num > 100 &&  num < 1000 ) {
                bonus = 0.2*num;
            } else {
                if (num > 1000) {
                    bonus = 0.1*num;
                }
            }
        }
        if (num % 2 == 0) {
            bonus = bonus+1;
        } else {
            if (num % 2 > 0 && num % 5 == 0) {
                bonus = bonus+2;
            }
        }
        System.out.println(bonus);
        System.out.println(num+bonus);

    }
}
