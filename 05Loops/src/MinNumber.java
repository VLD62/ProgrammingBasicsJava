import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class MinNumber {
      public static void main(String[] args) {
            int min = Integer.MAX_VALUE;
            Scanner in = new Scanner(System.in);
            int n = Integer.parseInt(in.nextLine());

            for (int i = 0; i < n ; i++) {
                int num = Integer.parseInt(in.nextLine());
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min);
      }
    
}
