import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/13/2017.
 */
public class p02_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);
    }
}
