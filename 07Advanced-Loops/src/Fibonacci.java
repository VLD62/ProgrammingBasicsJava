import java.util.Scanner;

/**
 * Created by vld62 on 6/13/17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int f0 = 1;
        int f1 = 1;

        for (int i = 0; i < n - 1  ; i++) {
            int fNext  = f0 + f1;
            f0 = f1;
            f1 = fNext;

        }
        System.out.println(f1);
    }
}
