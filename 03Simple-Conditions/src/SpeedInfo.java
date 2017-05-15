import java.util.Scanner;

/**
 * Created by viliev on 15.5.2017 г..
 */
public class SpeedInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = Double.parseDouble(in.nextLine());
        if (num <= 10) {
            System.out.println("slow");
        } else if (num > 10 && num <= 50 ) {
            System.out.println("average");
        } else if (num > 50 && num <= 150 ) {
            System.out.println("fast");
        } else if (num > 150 && num <= 1000 ) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
