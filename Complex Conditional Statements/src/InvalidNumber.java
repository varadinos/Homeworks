import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/25/2017.
 */
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isInRange = (number >= 100 && number <= 200) || number == 0;

        if (!isInRange){
            System.out.println("invalid");
        }
    }
}
