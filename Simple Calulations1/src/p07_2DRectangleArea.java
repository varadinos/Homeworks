import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/14/2017.
 */
public class p07_2DRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double w = Math.max(x1, x2) - Math.min(x1, x2);
        double h = Math.max(y1, y2) - Math.min(y1, y2);

        double area = w * h;
        double perimeter = 2*(w+h);

        System.out.println(area);
        System.out.println(perimeter);

    }
}
