import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by viliev on 16.5.2017 г..
 */
public class PoolPipes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double v = Double.parseDouble(in.nextLine());
        double p1 = Double.parseDouble(in.nextLine());
        double p2 = Double.parseDouble(in.nextLine());
        double h = Double.parseDouble(in.nextLine());
        double v1 = h*p1 + h*p2;;
        DecimalFormat df = new DecimalFormat("#.00");
        // if ( v >= 1  && v <= 10000 && p1 >= 1 && p1 <= 5000 && p2 >= 1 && p2 <= 5000 && h >= 1.00 && h <= 24.00 ) {
            //v1 = h*p1 + h*p2;

            if (v1<=v) {

                System.out.println("The pool is "+(int)((100*v1)/v)+"% full. Pipe 1: "+(int)((h*p1*100)/v1)+"%. Pipe 2: " +(int)((h*p2*100)/v1)+ "%.");

               // System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", (int)x, (int)y,(int)z) ;


            } else {
                System.out.println("For "+ new DecimalFormat("#.##").format(h) +" hours the pool overflows with " +new DecimalFormat("#.##").format(v1-v)  + " liters.");
                //System.out.printf("For %s hours the pool overflows with %s liters.", Math.round(h), Math.round(v1-v));
            }

       // } else {
       //    System.out.println("V must be in [1…10000], P1 and P2 must be in [1…5000] and H must be in [1.0…24.00]");
      //  }
    }
}
