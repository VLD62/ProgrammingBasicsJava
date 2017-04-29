import java.util.Scanner;
/**
 * Created by vld62 on 4/29/17.
 */
public class p08_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area =(a * h)/2;

        System.out.printf("%.2f", area);
    }
}
