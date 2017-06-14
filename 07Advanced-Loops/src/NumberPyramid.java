import java.util.Scanner;

/**
 * Created by vld62 on 6/13/17.
 */
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n  = Integer.parseInt(in.nextLine());
        int counter = 0;
        for (int row = 1; row <= n ; row++) {

            for (int col = 1 ; col <= row ; col++) {

                if (counter < n) {
                    counter++;
                    System.out.print(counter+" ");
                }


            }
            System.out.println();
        }
    }

}
