import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/14/2017.
 */
public class p09_CelsiustToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c = Double.parseDouble(scanner.nextLine());
        double f = c * 1.8 + 32;
        System.out.printf("%.2f", f);
    }
}
