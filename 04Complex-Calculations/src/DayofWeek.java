import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class DayofWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        if (n > 0 && n < 8) {
            switch (n) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                     System.out.println("Thursday");
                     break;
                 case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
             }
        } else {
            System.out.println("error");
        }
    }
}
