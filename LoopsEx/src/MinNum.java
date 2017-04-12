import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/1/2017.
 */
public class MinNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int minNum = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < minNum) {
                minNum = num;
            }
        }

        System.out.println(minNum);

    }
}
