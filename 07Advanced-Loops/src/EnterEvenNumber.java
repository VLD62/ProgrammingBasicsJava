import java.util.Scanner;

/**
 * Created by vld62 on 6/13/17.
 */
public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {

            System.out.println("Enter even number: ");
            n = Integer.parseInt(in.nextLine());
            if (n % 2 == 0) {
                break;
            }
            System.out.println("The number is not even.");
            } catch (Exception ex) {
                System.out.println("Invalid number.");
            }
        }
        System.out.println("Even number entered: "+n);




    }
}
