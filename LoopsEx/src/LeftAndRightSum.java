import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/1/2017.
 */
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //  int numberCount = 2 * n;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int right = Integer.parseInt(scanner.nextLine());
            rightSum += right;
        }

        for (int i = 0; i < n; i++) {
            int left = Integer.parseInt(scanner.nextLine());
            leftSum += left;
        }

        int diff = Math.abs(leftSum - rightSum);

        if (diff != 0) {
            System.out.println(String.format("No, diff = %d", diff));
        } else {
            System.out.printf("Yes, sum = %d%n", leftSum);
        }

    }
}
