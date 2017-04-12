import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/10/2017.
 */
public class p06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int height = 2 * n - 1;
        int maxWidth = 2 * n - 1;

        // upper part
        for (int i = 0; i < n; i++) {
            String spaces = newString(" ", (n - 1) - i);
            System.out.println(spaces + "*" + newString(" *", i));
        }
        for (int i = n - 1; i > 0; i--) {
            String spaces = newString(" ", (n - i));
            System.out.println(spaces + "*" + newString(" *", i - 1));
        }
    }

    public static String newString(String text, int repeatCount) {
        String a = "";
        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}

