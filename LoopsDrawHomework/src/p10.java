import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/12/2017.
 */
public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int leftRight = (n - 1) / 2;

        for (int i = 1; i <= (n - 1) / 2; i++) {
// Draw the top part
            System.out.print(newString("-", leftRight));
            System.out.print("*");
            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                System.out.print(newString("-", mid));
                System.out.print("*");
            }

            System.out.println(newString("-", leftRight));
            leftRight--;
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
