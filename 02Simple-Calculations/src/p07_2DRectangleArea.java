import  java.util.Scanner;
/**
 * Created by vld62 on 4/29/17.
 */
public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double area = (Math.abs(x1-x2))*(Math.abs(y2-y1));

        double perimeter = 2* (Math.abs(x1-x2)+Math.abs(y2-y1));

        System.out.println(area);
        System.out.println(perimeter);

    }
}
