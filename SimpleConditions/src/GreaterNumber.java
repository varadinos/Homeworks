import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/18/2017.
 */
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if ( a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
