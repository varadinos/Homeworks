/**
 * Created by Stoyan Varadinov on 3/11/2017.
 */
import java.util.Scanner;
public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double b1 = Double.parseDouble(console.nextLine());
        double b2 = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        double area = (b1+b2) * h / 2;
        System.out.println(area);
    }
}

