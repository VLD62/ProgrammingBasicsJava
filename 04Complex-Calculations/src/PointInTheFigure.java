import java.util.Scanner;

/**
 * Created by vld62 on 5/21/17.
 */
public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = Integer.parseInt(in.nextLine());
        int x = Integer.parseInt(in.nextLine());
        int y = Integer.parseInt(in.nextLine());
        //figure1
        int x1 = h;
        int y1 = h;
        int x2 = 2*h;
        int y2 = 4*h;
        //figure2
        int z1 = 0;
        int v1 = 0;
        int z2 = 3*h;
        int v2 = h;

        if ((x >= x1 && x <= x2 && y >= y1 && y <= y2) || (x >= z1 && x <= z2 && y >= v1 && y <= v2)) {
            if ((x == x1 && y >= y1 && y <= y2)
                    || (x == x2 && y >= y1 && y <= y2)
                    || (y == y1 && x >= x1 && x <= x2)
                    || (y == y2 && x >= x1 && x <= x2)
                    || (x == z1 && y >= v1 && y <= v2)
                    || (x == z2 && y >= v1 && y <= v2)
                    || (y == v1 && x >= z1 && x <= z2)
                    || (y == v2 && x >= z1 && x <= z2) ) {
                if (x > x1 && x < x2 && y == y1) {
                    System.out.println("inside");
                } else {
                System.out.println("border");
                }
            } else {
                System.out.println("inside");
            }
        } else {
            System.out.println("outside");
        }

    }
}
