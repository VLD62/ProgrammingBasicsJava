/**
 * Created by viliev on 6.6.2017 г..
 */
public class Rectangle10Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(strBuilder(10,"*"));
        }
    }

    public static String strBuilder(int count, String character) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(character);
        }

        return builder.toString();
    }
}
