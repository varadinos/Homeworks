import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/14/2017.
 */
public class p02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double in = Double.parseDouble(scanner.nextLine());
        double cm = in * 2.54;
        System.out.println(cm);
    }
}
