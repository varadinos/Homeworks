/**
 * Created by Stoyan Varadinov on 3/11/2017.
 */
import java.util.Scanner;
public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());

        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;

        System.out.println(area);
        System.out.println(perimeter);

    }
}
