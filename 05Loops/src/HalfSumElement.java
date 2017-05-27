import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class HalfSumElement {
    public static void main(String[] args) {
        int sum = 0;
        int maxnum = 0;
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(in.nextLine());
            sum = sum + num;
            if (num > maxnum) {
                maxnum = num;
            }
        }
        if (maxnum == sum - maxnum) {
            System.out.println("Yes");
            System.out.println("Sum = " + Math.abs(sum - maxnum));
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sum  - 2*maxnum));
        }
    }
}
