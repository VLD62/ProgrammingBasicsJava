import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by vld62 on 5/13/17.
 */
public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = Double.parseDouble(in.nextLine());
        String inUnit = in.nextLine();
        String outUnit = in.nextLine();

        if (inUnit.equals("m")) {
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                System.out.println(num*1000 +" mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        } else if (inUnit.equals("mm")) {
            num = num/1000;
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                System.out.println(num*1000 +" mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        } else if (inUnit.equals("cm")) {
            num = num/100;
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                System.out.println(num*1000 +" mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        } else if (inUnit.equals("mi")) {
            num = num/(0.000621371192);
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                DecimalFormat df = new DecimalFormat("#.#######");
                df.setRoundingMode(RoundingMode.CEILING);
                System.out.println(df.format(num*1000)+ " mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        } else if (inUnit.equals("in")) {
            num = num/39.3700787;
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                System.out.println(num*1000 +" mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        } else if (inUnit.equals("km")) {
            num = num/0.001;
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                System.out.println(num*1000 +" mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        } else if (inUnit.equals("ft")) {
            num = num/3.2808399;
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                System.out.println(num*1000 +" mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        } else if (inUnit.equals("yd")) {
            num = num/1.0936133;
            if (outUnit.equals("m")) {
                System.out.println(num + " m");
            } else if (outUnit.equals("mm")) {
                System.out.println(num*1000 +" mm");
            } else if (outUnit.equals("cm")) {
                System.out.println(num*100+" cm");
            } else if (outUnit.equals("mi")) {
                System.out.println(num*0.000621371192+" mi");
            } else if (outUnit.equals("in")) {
                System.out.println(num*39.3700787+" in");
            } else if (outUnit.equals("km")) {
                System.out.println(num*0.001+" km");
            } else if (outUnit.equals("ft")) {
                System.out.println(num*3.2808399+" ft");
            } else if (outUnit.equals("yd")) {
                System.out.println(num*1.0936133+" yd");
            }
        }

    }
}

