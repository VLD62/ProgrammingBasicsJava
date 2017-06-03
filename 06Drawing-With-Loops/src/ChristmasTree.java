import java.util.Scanner;

/**
 * Created by vld62 on 6/3/17.
 */
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int r = 0; r <= n ; r++) {
            String leftPart = repeatStr(" ", n - r) + repeatStr("*", r);
            String middlePart = " | ";
            String rightPart = repeatStr(" " ,r - n) + repeatStr("*",r);
            System.out.println(leftPart+middlePart+rightPart);

        }


    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
