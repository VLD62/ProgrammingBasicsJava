import java.util.Scanner;

/**
 * Created by viliev on 15.5.2017 г..
 */
public class Time_15_Minutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = Integer.parseInt(in.nextLine());
        int minute = Integer.parseInt(in.nextLine());
        minute = minute + 15;
        if (minute >= 60) {
            hour = hour+1;
            minute = minute - 60;
        }
        if (hour > 23) {
            hour = 0;
        }
        if (minute < 10) {
            System.out.println(hour+":0"+minute);
        } else {
            System.out.println(hour+":"+minute);
        }


    }
}
