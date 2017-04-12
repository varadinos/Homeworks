import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/12/2017.
 */
public class USDToBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double usd = Double.parseDouble(console.nextLine());
        double bgn = usd * 1.79549;
        System.out.printf("%.2f", bgn);
    }
}
