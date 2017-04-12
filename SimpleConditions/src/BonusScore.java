import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/18/2017.
 */
public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0;

        if (score <= 100) {
            bonusScore = bonusScore + 5;
        } else if (score > 100 && score <= 1000) {
            bonusScore = (score * 20) / 100.0;
        } else if (score > 1000) {
            bonusScore = (score * 10) / 100.0;
        }

        if (score % 2 == 0) {
            bonusScore = bonusScore + 1;
        }

        if (score % 10 == 5) {
            bonusScore = bonusScore + 2;
        }
        System.out.println(bonusScore);
        System.out.println(score + bonusScore);
    }
}
