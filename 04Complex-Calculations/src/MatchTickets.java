import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by viliev on 31.5.2017 г..
 */
public class MatchTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double budget = Double.parseDouble(in.nextLine());
        String category = in.nextLine();
        int people = Integer.parseInt(in.nextLine());
        double budgetPercent = 0 , transportPrice = 0 , finalBudget = 0 ,ticketPrice = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        if (people >= 1 && people <=4) {
            budgetPercent = 75;
        } else if (people >= 5 && people <= 9) {
            budgetPercent = 60;
        } else if (people >= 10 && people <= 24) {
            budgetPercent = 50;
        } else if (people >= 25 && people <= 49) {
            budgetPercent = 40;
        } else if (people >= 50) {
            budgetPercent = 25;
        }

        transportPrice = budget*budgetPercent/100;
        finalBudget = budget - transportPrice;

        switch (category){
            case "VIP":
                ticketPrice = people * 499.99;
                break;
            case "Normal":
                ticketPrice = people * 249.99;
                break;
        }

        if (finalBudget > ticketPrice) {
            System.out.println("Yes! You have " + df.format(finalBudget-ticketPrice) + " leva left.");
        } else {
            System.out.println("Not enough money! You need " + df.format(ticketPrice - finalBudget) + " leva.");
        }



    }
}
