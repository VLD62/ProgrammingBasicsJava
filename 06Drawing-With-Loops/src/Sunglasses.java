import java.util.Scanner;

/**
 * Created by vld62 on 6/3/17.
 */
public class Sunglasses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        //Top
        System.out.printf("%s%s%s%n",
                repeatStr("*", 2 * n),
                repeatStr(" ",n),
                repeatStr("*",2 * n));
        //Middle
        for (int r = 1; r <= n - 2; r++) {
            String leftSide = "*" + repeatStr("/", 2*n - 2) + "*";
            String middleSide = "";
            if (( n %2 == 0 && r == n /2 - 1)  || (n %2 != 0 && r == n /2)) {
                middleSide = repeatStr("|", n);
            } else {
                middleSide= repeatStr(" ", n);
            }
            System.out.println(leftSide + middleSide + leftSide);
        }
        //Bottom
        System.out.printf("%s%s%s%n",
        repeatStr("*", 2 * n),
                repeatStr(" ",n),
                repeatStr("*",2 * n));

    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
