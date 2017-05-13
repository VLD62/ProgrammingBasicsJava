import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class Number100_200 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        if (num < 100) {
            System.out.println("Less than 100");
        } else if (num >= 100 && num <= 200 ) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
