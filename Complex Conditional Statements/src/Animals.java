import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/29/2017.
 */
public class Animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
                default:
                System.out.println("unknown");
                break;
        }
    }
}
