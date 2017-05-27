import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(in.nextLine());
            sum = num + sum;
        }

        System.out.println(sum);

    }
}
