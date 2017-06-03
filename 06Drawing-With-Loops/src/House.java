import java.util.Scanner;

/**
 * Created by vld62 on 6/3/17.
 */
public class House {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = Integer.parseInt(in.nextLine());
        int base = h /2;
        int roof = h - base;
        int stars;
        //Top
        if (h % 2 == 0){
            stars = 2;
        } else {
            stars = 1;
        }

        for (int r = 1; r <= roof ; r++) {

            System.out.printf("%s%s%s%n",
                    repeatStr("-", (h - stars)/2),
                    repeatStr("*", stars),
                    repeatStr("-",(h - stars)/2));
            stars +=2;
        }

        for (int r = 0; r < base ; r++) {
            System.out.printf("|%s|%n",
                    repeatStr("*", h - 2));

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
