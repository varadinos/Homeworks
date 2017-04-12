import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/12/2017.
 */
public class p08_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int c = 0;
        if (n % 2 == 0){
            c = (n-2)/2-1;
        } else if (n % 2 == 1){
            c = (n-2)/2;
        }

        String stars = newString("*", n * 2);
        String space = newString(" ", n);
        String fig1 = newString("/", n * 2 - 2);
        String fig2 = newString("|", n);

        System.out.println(stars + space + stars);
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*" + fig1 + "*");
            boolean center = i == c;
            System.out.print(center ? fig2 : space);
            System.out.println("*" + fig1 + "*");
        }
        System.out.println(stars + space + stars);
    }

    public static String newString(String text, int repeatCount) {
        String a = "";
        for (int i = 0; i < repeatCount; i++) {
            a += text;
        }
        return a;
    }
}
