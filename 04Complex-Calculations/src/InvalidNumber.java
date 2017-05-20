import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        if (num == 0 || (num >= 100 && num <= 200)){

        } else {
            System.out.println("invalid");
        }
    }
}
