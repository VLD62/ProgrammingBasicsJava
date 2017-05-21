import java.util.Scanner;

/**
 * Created by vld62 on 5/21/17.
 */
public class AnimalType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String animal = in.nextLine();
        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
