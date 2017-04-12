import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/1/2017.
 */
public class Sum1ToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 1;
        int sum = 1;
        System.out.print("The num 1");
        while   (num < n) {
            num++;
            sum += num;
            System.out.printf("+%d", num);
        }
        System.out.printf(" = %d%n", sum);
    }
}
