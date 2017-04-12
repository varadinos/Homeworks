import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/18/2017.
 */
public class ExcellentResultOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 5.50) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not excellent.");
        }
    }
}