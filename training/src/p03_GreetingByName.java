import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/13/2017.
 */
public class p03_GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
