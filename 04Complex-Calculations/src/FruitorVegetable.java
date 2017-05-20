import java.util.Scanner;

/**
 * Created by vld62 on 5/20/17.
 */
public class FruitorVegetable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product = in.nextLine();

        if (product.equals("banana") || product.equals("apple") || product.equals("kiwi")
                || product.equals("cherry") || product.equals("lemon") || product.equals("grapes") ) {
            System.out.println("fruit");
        } else if (product.equals("tomato") || product.equals("cucumber") || product.equals("pepper")
                || product.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
