import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class PointonRectangleBorder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double x1 = Double.parseDouble(in.nextLine());
        Double y1 = Double.parseDouble(in.nextLine());
        Double x2 = Double.parseDouble(in.nextLine());
        Double y2 = Double.parseDouble(in.nextLine());
        Double x  = Double.parseDouble(in.nextLine());
        Double y  = Double.parseDouble(in.nextLine());
        if ((x.equals(x1) && (y>=y1 && y<=y2)) ||  (x.equals(x2) && (y>=y1 && y<=y2)) ||
                (y.equals(y1) && (x>=x1 && x<=x2)) ||  (y.equals(y2) && (x>=x1 && x<=x2)) ) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}