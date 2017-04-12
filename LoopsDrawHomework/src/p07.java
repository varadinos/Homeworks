import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/10/2017.
 */
public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(newString(" ",n) + " | ");

        for (int i = 1; i <= n; i++) {
            String spaces = newString(" ", n - i);
            String a = newString("*",i);
            System.out.println(spaces + a + " | " + a + spaces);
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
