import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/29/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pro = scanner.nextLine().toLowerCase();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double money = 0.0;

        if (pro.equals("premiere")) {
            money = (r * c) * 12.0;
        } else if (pro.equals("normal")) {
            money = (r * c) * 7.50;
        } else if (pro.equals("discount")) {
            money = (r * c) * 5.0;
        }
        System.out.printf("%.2f", money);
    }
}
