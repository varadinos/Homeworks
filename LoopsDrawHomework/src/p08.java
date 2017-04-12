import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/12/2017.
 */
public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print(newString("*", 2 * n));
        System.out.print(newString(" ", n));
        System.out.println(newString("*", 2 * n));

        for (int i = 0; i < n-2 ; i++) {
            System.out.print("*" + newString("/", 2*n-2) + "*" + newString("|",n));
            System.out.print("*" + newString("/", 2*n-2));
            System.out.println("*");
        }
        System.out.print(newString("*", 2 * n));
        System.out.print(newString(" ", n));
        System.out.println(newString("*", 2 * n));
    }

    public static String newString(String text, int repeatCount) {
        String a = "";
        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
