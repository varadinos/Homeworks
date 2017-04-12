import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/22/2017.
 */
public class Pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p1h = p1 * h;
        double p2h = p2 * h;
        double trubi = p1h + p2h;

        if (trubi <= v) {
            double truba1 = Math.floor((p1h * 100) / trubi);
            double truba2 = Math.floor((p2h * 100) / trubi);
            double full = Math.floor((trubi * 100) / v);
            System.out.println("The pool is " + full + "% full. Pipe 1: " + truba1 + "%. Pipe 2: " + truba2 + "%.");
        } else if (trubi > v) {
            double prelql = trubi - v;
            System.out.println("For " + h + " hours the pool overflows with " + Math.round(prelql) + " liters.");
        }
    }
}
