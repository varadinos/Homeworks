import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/1/2017.
 */
public class Chashi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int broiChashi = Integer.parseInt(scan.nextLine());
        int broiRabotnici = Integer.parseInt(scan.nextLine());
        int dni = Integer.parseInt(scan.nextLine());
        double result = Math.floor((broiRabotnici * (dni * 8))/5);

        double chashiRazlika = Math.abs(broiChashi - result);
        if (broiChashi < result ) {
            double pari = chashiRazlika * 4.2;
            System.out.printf("%.2f extra money", pari);
        } else {
            double pari = chashiRazlika * 4.2;
            System.out.printf("Losses: %.2f",pari);
        }

    }
}
