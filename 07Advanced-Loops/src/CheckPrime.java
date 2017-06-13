import java.util.Scanner;

/**
 * Created by vld62 on 6/13/17.
 */
public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }


        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}
