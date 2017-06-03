import java.util.Scanner;

/**
 * Created by vld62 on 6/3/17.
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        if ( n <= 2) {
            System.out.println(repeatStr("*", n));
        } else {
            int topHeigth = n/2;
            int middleDashes = 0;
            int sideDashes = (n - 2)/2;

            if (n %2  != 0) {
                System.out.printf("%s*%s%n",
                        repeatStr("-", (n - 1) / 2),
                        repeatStr("-", (n - 1) / 2));
                        middleDashes = 1;

            }


            for (int r = 0; r < topHeigth; r++) {
                System.out.printf("%s*%s*%s%n",
                        repeatStr("-", sideDashes),
                        repeatStr("-", middleDashes),
                        repeatStr("-", sideDashes));

                middleDashes +=2;
                sideDashes--;
            }

            middleDashes -=4;
            sideDashes +=2;

            for (int r = topHeigth - 1; r >= 1; r--) {
                System.out.printf("%s*%s*%s%n",
                        repeatStr("-", sideDashes),
                        repeatStr("-", middleDashes),
                        repeatStr("-", sideDashes));

                middleDashes -=2;
                sideDashes++;

            }

            if (n % 2 != 0) {
                System.out.printf("%s*%s%n",
                        repeatStr("-", (n - 1) / 2),
                        repeatStr("-", (n - 1) / 2));
            }

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
