import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class PointinRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double x1 = Double.parseDouble(in.nextLine());
        Double y1 = Double.parseDouble(in.nextLine());
        Double x2 = Double.parseDouble(in.nextLine());
        Double y2 = Double.parseDouble(in.nextLine());
        Double x  = Double.parseDouble(in.nextLine());
        Double y  = Double.parseDouble(in.nextLine());

        if ( x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }


}