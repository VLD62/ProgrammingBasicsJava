import java.util.Scanner;

/**
 * Created by vld62 on 6/3/17.
 */
public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int spaceCount = n -1;
        for (int r = 1; r <= n ; r++) {
            System.out.println(repeatStr(" ", spaceCount) + repeatStr("* ", r));
            spaceCount--;
        }
        spaceCount++;
        for (int r = n - 1; r >= 1 ; r--) {
            System.out.println(repeatStr(" ", spaceCount) + repeatStr(" *", r));
            spaceCount++;
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
