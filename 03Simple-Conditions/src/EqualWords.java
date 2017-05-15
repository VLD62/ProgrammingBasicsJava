import java.util.Scanner;

/**
 * Created by viliev on 15.5.2017 г..
 */
public class EqualWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.nextLine();
        String word2 = in.nextLine();

        if ((word1.toLowerCase()).equals((word2.toLowerCase()))) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
