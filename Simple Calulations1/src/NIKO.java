import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/14/2017.
 */
public class NIKO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BGN = Double.parseDouble(scanner.nextLine());
        double USD = BGN * 1.75;
        double EUR = BGN * 2;
        double POUND =  BGN * 2.3;
        double CRONE = BGN * 1.6;
        double frank = BGN * 1.55;

        System.out.println("BGN-USD = ");
        System.out.println(USD);
        System.out.println("BGN-EUR = ");
        System.out.println(EUR);
        System.out.println("BGN-POUND =");
        System.out.println(POUND);
        System.out.println("BGN-CRONE =");
        System.out.println(CRONE);
        System.out.println("BGN-FRANK =");
        System.out.println(frank);
    }
}
