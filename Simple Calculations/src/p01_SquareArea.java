import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/11/2017.
 */
public class p01_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;
        System.out.println("Square = " + area);

    }
}
