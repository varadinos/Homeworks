import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/4/2017.
 */
public class p07_Lqvaidqsnasuma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        int numberCount = 2 * n;

        for (int i = 0; i < numberCount; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (i < n) {
                leftSum += num;
            } else {
                rightSum += num;
            }
        }

        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            int diff = Math.abs(rightSum - leftSum);
            System.out.printf("No, diff = %d", diff);
        }


    }
}
