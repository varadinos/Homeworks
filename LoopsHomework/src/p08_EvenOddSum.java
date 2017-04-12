import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/4/2017.
 */
public class p08_EvenOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (i %2 == 0) {
                oddSum += num;
            } else {
                evenSum += num;
            }
        }
        if (oddSum == evenSum) {
            System.out.printf("Yes Sum = %d", evenSum);
        } else {
            int diff = Math.abs(oddSum - evenSum);
            System.out.printf("No Diff = %d", diff);
        }

    }
}
