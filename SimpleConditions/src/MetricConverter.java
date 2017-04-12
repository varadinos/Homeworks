import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/20/2017.
 */
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String in = scanner.nextLine();
        String out = scanner.nextLine();

        if (in.equals("mm")) {
            num = num / 1000.0;
        } else if (in.equals("cm")) {
            num = num / 100.0;
        } else if (in.equals("mi")) {
            num = num / 0.000621371192;
        } else if (in.equals("in")) {
            num = num / 39.3700787;
        } else if (in.equals("km")) {
            num = num / 0.001;
        } else if (in.equals("ft")) {
            num = num / 3.2808399;
        } else if (in.equals("yd")) {
            num = num / 1.0936133;
        }


        if (out.equals("mm")) {
            num = num * 1000.0;
        } else if (out.equals("cm")) {
            num = num * 100.0;
        } else if (out.equals("mi")) {
            num = num * 0.000621371192;
        } else if (out.equals("in")) {
            num = num * 39.3700787;
        } else if (out.equals("km")) {
            num = num * 0.001;
        } else if (out.equals("ft")) {
            num = num * 3.2808399;
        } else if (out.equals("yd")) {
            num = num * 1.0936133;
        }
        System.out.printf("%f %s", num, out);
    }
}

