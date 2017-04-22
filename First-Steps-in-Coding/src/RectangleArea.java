import java.util.Scanner;

/**
 * Created by vld62 on 4/22/17.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,area;
        System.out.println("Please enter value for a: ");
        a = in.nextInt();
        System.out.println("Please enter value for b: ");
        b = in.nextInt();
        area = a*b;
        System.out.println("Area of rectangle is :" + area);
    }
}
