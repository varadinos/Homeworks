import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/12/2017.
 */
public class RadToDeg {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double rad = Double.parseDouble(console.nextLine());
        double deg = (rad * 180)/Math.PI;
        System.out.println(Math.round(deg));

    }
}
