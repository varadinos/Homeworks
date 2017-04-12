import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/20/2017.
 */
public class ThreeEqualNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a == b && b == c){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
