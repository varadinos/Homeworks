import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/4/2017.
 */
public class p04_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
