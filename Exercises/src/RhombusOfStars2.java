import java.util.Scanner;

/**
 * Created by viliev on 8.6.2017 г..
 */
public class RhombusOfStars2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int counter = n;

        for (int i = 1; i <= n ; i++) {
                counter--;
                System.out.println(strBuilder(counter," ") + strBuilder(i,"* "));

        }
        counter=n;


        for (int i = 1; i <= n - 1  ; i++) {
            counter--;
            System.out.println(strBuilder(i," ") + strBuilder(counter,"* "));
        }

    }

    static String strBuilder (int count, String Symbols) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count ; i++) {
            sb.append(Symbols);
        }


        return sb.toString();
    }
}
