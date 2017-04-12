import java.util.DoubleSummaryStatistics;
        import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/14/2017.
 */
public class p08_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = a * h / 2;
        System.out.printf("%.2f", area);
    }
}
