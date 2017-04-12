import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/11/2017.
 */
public class p02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inches: ");
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("centimeters = " + centimeters);

    }
}
