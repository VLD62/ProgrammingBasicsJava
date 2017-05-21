import java.util.Scanner;


/**
 * Created by vld62 on 5/21/17.
 */
public class Volleyball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String year = in.nextLine();
        double p = Integer.parseInt(in.nextLine());
        double h = Integer.parseInt(in.nextLine());
        double result = 0;
        switch (year){
            case "leap":
                result = ((((48-h)*3/4) + h + (p*2/3))*15)/100 + (((48-h)*3/4) + h + (p*2/3)) ;
                break;
            case "normal":
                result = ((48-h)*3/4) + h + (p*2/3);
                break;
        }
        System.out.println((int)(result));
    }
}
