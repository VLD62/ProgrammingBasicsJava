import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double result = Double.parseDouble(in.nextLine());
        boolean even = (result % 2 == 0);
        if (even) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
