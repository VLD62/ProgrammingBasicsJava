/**
 * Created by vld62 on 4/22/17.
 */
public class TriangleOf55Stars {
    public static void main (String [] args) {

        for (int i = 1; i <= 10; i++) {
            String line = repeatChar(i,  '*');
            System.out.println(line);

        }
        /*System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("******");
        System.out.println("*******");
        System.out.println("********");
        System.out.println("*********");
        System.out.println("**********");*/
    }

    public static String repeatChar (int count, char symbol) {
        String result  = "";
        for (int i = 1; i <= count; i++) {
            result += symbol;

        }
        return  result;
    }
}
