import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
/**
 * Created by vld62 on 4/29/17.
 */
public class p13_1000DaysAfterBirth {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        LocalDate dateFormatted = LocalDate.parse(date, formatter);
        LocalDate outDate = dateFormatted.plusDays(999);
        System.out.println(outDate.format(formatter));
    }
}
