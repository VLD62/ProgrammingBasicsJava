import java.util.Scanner;

/**
 * Created by vld62 on 5/5/17.
 */
public class p14_ClassroomArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h = Double.parseDouble(in.nextLine());
        double w = Double.parseDouble(in.nextLine());

        if (w <= 100 || w >= 3) {
            if (h >= 3 || h <= w ){

                double rows = (h*100)/120;
                double columns = (w*100-100)/70;

                int total = ((int)rows*(int)columns)-3;
                System.out.println(total);

            } else {
                System.out.println("Height should be between 3 and " + h + " meters!");
            }
        } else {
            System.out.println("Width should be between 3 and 100 meters!");
        }

    }
}
