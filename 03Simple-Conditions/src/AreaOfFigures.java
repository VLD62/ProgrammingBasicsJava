import java.util.Scanner;

/**
 * Created by viliev on 15.5.2017 г..
 */
public class AreaOfFigures {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String figure = in.nextLine();
    if (figure.equals("square") || figure.equals("circle")) {
        double num = Double.parseDouble(in.nextLine());
        if (figure.equals("square")) {
            System.out.printf("%.3f",num*num);
        } else {
            System.out.printf("%.3f",Math.PI*num*num);
        }

    } else if (figure.equals("triangle") || figure.equals("rectangle")) {
        double num = Double.parseDouble(in.nextLine());
        double num1 = Double.parseDouble(in.nextLine());
        if (figure.equals("rectangle")){
            System.out.printf("%.3f",num*num1);
        } else {
            System.out.printf("%.3f",(num*num1)/2);
        }
    } else {
        System.out.println("unknown figure");
    }
    }
}
