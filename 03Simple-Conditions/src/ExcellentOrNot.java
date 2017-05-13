import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double result = Double.parseDouble(in.nextLine());
        if (result >= 5.50) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}
