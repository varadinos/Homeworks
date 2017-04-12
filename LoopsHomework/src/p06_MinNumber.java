import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/4/2017.
 */
public class p06_MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num < minNum) {
                minNum = num;
            }
        }

        System.out.println(minNum);
    }
}
