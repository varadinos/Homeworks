import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/10/2017.
 */
public class p02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println(newString("*",n));
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
