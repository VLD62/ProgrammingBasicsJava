import java.util.Scanner;

/**
 * Created by vld62 on 4/29/17.
 */
public class p10_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rad = Double.parseDouble(scan.nextLine());
        double deg = (rad*180)/Math.PI;
        System.out.println((int)Math.round(deg));
    }
}
