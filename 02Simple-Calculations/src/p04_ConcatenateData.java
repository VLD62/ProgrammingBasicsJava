import java.util.Scanner;
/**
 * Created by vld62 on 4/29/17.
 */
public class p04_ConcatenateData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String town = console.nextLine();
        System.out.printf("You are %s %s, a %s-years old person from %s.", firstName, lastName, age, town);
    }
}
