import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double age = Double.parseDouble(in.nextLine());
        String gender = in.nextLine();
        if (age < 16) {
           if (gender.equals("m")) {
              System.out.println("Master");
            } else {
               System.out.println("Miss");
           }
        } else {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            } else {
                System.out.println("Ms.");
            }
        }
    }

}
