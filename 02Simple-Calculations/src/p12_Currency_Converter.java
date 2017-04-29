import java.util.Scanner;
/**
 * Created by vld62 on 4/29/17.
 */
public class p12_Currency_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inSum = Double.parseDouble(scan.nextLine());
        String inCurrency = scan.nextLine();
        String outCurrency = scan.nextLine();

        switch (inCurrency){
            case  "BGN":
                if (outCurrency.equals("EUR")) {
                    System.out.printf("%.2f EUR", inSum/1.95583);
                } else if (outCurrency.equals("USD")) {
                    System.out.printf("%.2f USD", inSum/1.79549);
                } else if (outCurrency.equals("GBP")) {
                    System.out.printf("%.2f GBP", inSum/2.53405);
                 } else {
                    System.out.println("In and out currencies are equal or unknown.");
                }
            break;
            case  "EUR":
                if (outCurrency.equals("BGN")) {
                    System.out.printf("%.2f BGN", inSum*1.95583);
                } else if (outCurrency.equals("USD")) {
                    System.out.printf("%.2f USD", (inSum*1.95583)/1.79549);
                } else if (outCurrency.equals("GBP")) {
                    System.out.printf("%.2f GBP", (inSum*1.95583)/2.53405);
                } else {
                    System.out.println("In and out currencies are equal or unknown.");
                }
            break;
            case  "USD":
                if (outCurrency.equals("BGN")) {
                    System.out.printf("%.2f BGN", inSum*1.79549);
                } else if (outCurrency.equals("EUR")) {
                    System.out.printf("%.2f EUR", (inSum*1.79549)/1.95583);
                } else if (outCurrency.equals("GBP")) {
                    System.out.printf("%.2f GBP", (inSum*1.79549)/2.53405);
                } else {
                    System.out.println("In and out currencies are equal or unknown.");
                }
            break;
            case  "GBP":
                if (outCurrency.equals("BGN")) {
                    System.out.printf("%.2f BGN", inSum*2.53405);
                } else if (outCurrency.equals("EUR")) {
                    System.out.printf("%.2f EUR", (inSum*2.53405)/1.95583);
                } else if (outCurrency.equals("USD")) {
                    System.out.printf("%.2f USD", (inSum*2.53405)/1.79549);
                } else {
                    System.out.println("In and out currencies are equal or unknown.");
                }
            break;

        }


    }
}
