import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/14/2017.
 */
public class p10_RadToDeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double d = r * 180/Math.PI;
        System.out.println(Math.round(d));

    }
}
