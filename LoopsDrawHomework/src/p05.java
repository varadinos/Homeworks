import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/10/2017.
 */
public class p05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("+" + newString(" -", n-2) + " +");
        for (int i = 0; i < n - 2; i++) {
            System.out.println("|" + newString(" -", n-2) + " |");
        }
        System.out.println("+" + newString(" -", n-2) + " +");

    }

    public static String newString(String text, int repeatCount) {
        String a = "";
        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
