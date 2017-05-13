import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class PasswordGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pwd = in.nextLine();

        if (pwd.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
