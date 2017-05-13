import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class SumSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time1 = Integer.parseInt(in.nextLine());
        int time2 = Integer.parseInt(in.nextLine());
        int time3 = Integer.parseInt(in.nextLine());
        int totalTime = time1 + time2 + time3;

        if (totalTime > 0 && totalTime < 60) {
            if (totalTime < 10) {
            System.out.println("0:0"+totalTime);
            } else {
            System.out.println("0:"+totalTime);
            }
        }

        if (totalTime > 59 && totalTime < 120) {
            if (totalTime-60 < 10) {
            System.out.println("1:0"+(totalTime-60));
            } else {
                System.out.println("1:"+(totalTime-60));
            }
        }

        if (totalTime > 119 && totalTime < 180) {
            if (totalTime-120 < 10) {
                System.out.println("2:0"+(totalTime-120));
            } else {
                System.out.println("2:"+(totalTime-120));
            }
        }
    }
}
