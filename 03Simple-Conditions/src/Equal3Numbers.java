import java.util.Scanner;

/**
 * Created by viliev on 15.5.2017 г..
 */
public class Equal3Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.nextLine());
        int num2 = Integer.parseInt(in.nextLine());
        int num3 = Integer.parseInt(in.nextLine());

        if (num1 == num2 ) {
            if (num1 == num3) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
    }
}
