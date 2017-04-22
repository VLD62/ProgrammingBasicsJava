import java.util.Scanner;

/**
 * Created by vld62 on 4/22/17.
 */
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());


        String base = repeatChar(N, '*');

        System.out.println(base);

        String mid = repeatChar(N-2,' ');
        for (int i = 0; i < N - 2;i++){
            System.out.printf("*%s*\n", mid);
        }
        System.out.println(base);
        }

    public static String repeatChar (int count, char symbol) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += symbol;

        }
        return result;
    }
}
