import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/12/2017.
 */
public class p09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int stars = 1;

        if (n % 2 == 0) {
            stars++;
        }

        for (int i = 0; i < (n + 1) / 2; i++) {
            int padding = (n - stars) / 2;
            System.out.print(newString("-", padding));
            System.out.print(newString("*", stars));
            System.out.println(newString("-", padding));
            stars = stars + 2;
        }
        for (int i = 0; i < (n) / 2; i++) {
            int pipes = 2;
            System.out.println("|" + newString("*",n-pipes  ) + "|");
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
