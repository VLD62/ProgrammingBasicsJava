import java.util.Scanner;
/**
 * Created by vld62 on 4/29/17.
 */
public class p09_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());
        double fahrenheit = (celsius*1.8) + 32;
        System.out.printf("%.2f",fahrenheit);
    }
}
