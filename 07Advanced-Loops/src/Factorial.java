import java.util.Scanner;

/**
 * Created by vld62 on 6/13/17.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = i*factorial;
        }

        System.out.println(factorial);

    }
}
