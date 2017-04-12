import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/19/2017.
 */
public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        if  (first.equals(second)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
