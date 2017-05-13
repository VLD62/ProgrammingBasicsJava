import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class GreaterNumber {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double num1 = Double.parseDouble(in.nextLine());
    double num2 = Double.parseDouble(in.nextLine());
        if (num1 > num2) {
            System.out.println((int)num1);
        } else {
            System.out.println((int)num2);
         }
    }
}
