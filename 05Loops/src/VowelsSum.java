import java.util.Scanner;

/**
 * Created by vld62 on 5/27/17.
 */
public class VowelsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        long sum = 0;
        int num = 0;

        for (int i = 0; i <= s.length() - 1; i ++){
           switch( s.charAt(i) ){
               case 'a':
                   num = 1;
                   break;
               case 'e':
                   num = 2;
                   break;
               case 'i':
                   num = 3;
                   break;
               case 'o':
                   num = 4;
                   break;
               case 'u':
                   num = 5;
                   break;
               default:
                   num = 0;
                   break;
           }
           sum = sum + num;
        }

        System.out.println(sum);
    }
}
