import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class EqualPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        long prevSum = 0;
        long maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            int firstNumber = Integer.parseInt(in.nextLine());
            int secondNumber = Integer.parseInt(in.nextLine());
            long currentSum = firstNumber + secondNumber;

            if (i != 0) {

                if (prevSum != currentSum ) {
                    long currentDiff = Math.abs(prevSum - currentSum);
                    if ( currentDiff > maxDiff) {
                        maxDiff = currentDiff;
                    }
                }
            }

            prevSum = currentSum;
        }
        if (maxDiff == Integer.MIN_VALUE) {
            System.out.println("Yes, value="+prevSum);
        } else {
            System.out.println("No, maxdiff="+ Math.abs(maxDiff));
        }

    }
}
