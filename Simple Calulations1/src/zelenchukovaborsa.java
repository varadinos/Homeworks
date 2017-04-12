import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/14/2017.
 */
public class zelenchukovaborsa {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double cz = Double.parseDouble(scanner.nextLine());
       double cp = Double.parseDouble(scanner.nextLine());
       int kgz = Integer.parseInt(scanner.nextLine());
       int kgp = Integer.parseInt(scanner.nextLine());

        System.out.println((cz * kgz + cp * kgp)/1.94);
    }
}
