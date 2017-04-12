import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/12/2017.
 */
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double celsius = Double.parseDouble(console.nextLine());
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f", fahrenheit);

    }
}
