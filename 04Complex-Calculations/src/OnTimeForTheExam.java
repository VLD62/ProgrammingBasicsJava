import java.util.Scanner;

/**
 * Created by viliev on 30.5.2017 г..
 */
public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int examHour = Integer.parseInt(in.nextLine());
        int examMinute = Integer.parseInt(in.nextLine());
        int arrivalHour = Integer.parseInt(in.nextLine());
        int arrivalMinute = Integer.parseInt(in.nextLine());


        int totalDifference =(examHour*60 + examMinute)- (arrivalHour*60 + arrivalMinute);

        int hoursDifference = totalDifference/60;
        int minutesDifference = totalDifference%60;
        if (totalDifference >= 0 && totalDifference <= 30) {
            System.out.println("On time");
            System.out.println(totalDifference + " minutes before the start");
        } else if (totalDifference > 30 ) {
            System.out.println("Early");
            if (totalDifference < 60) {
                System.out.println(totalDifference + " minutes before the start");
            } else {
                if (minutesDifference >= 10) {
                System.out.println(hoursDifference+":"+minutesDifference + " hours before the start");
                } else {
                System.out.println(hoursDifference+":0"+minutesDifference + " hours before the start");
                }
            }
        } else {
            System.out.println("Late");
            if (Math.abs(totalDifference) < 60) {
                System.out.println(Math.abs(totalDifference) + " minutes after the start");
            } else {
                if (Math.abs(minutesDifference) >= 10) {
                System.out.println(Math.abs(hoursDifference)+":"+Math.abs(minutesDifference) +" hours after the start");
                } else {
                System.out.println(Math.abs(hoursDifference)+":0"+Math.abs(minutesDifference) +" hours after the start");
                }
            }


        }
    }
}
