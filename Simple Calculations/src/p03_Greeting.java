import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/11/2017.
 */
public class p03_Greeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //System.out.println("Enter your name: ");
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
