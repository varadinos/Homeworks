import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/2/2017.
 */
public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        double budgetFinal = 0;
        String nastanqvane = "";
        String town = "";

        switch (season) {
            case "Summer":
                if (budget <= 1000) {
                    budgetFinal = (budget * 65)/100.0;
                    nastanqvane = "Camp";
                    town = "Alaska";
                } else if (budget > 1000 && budget <= 3000) {
                    budgetFinal = (budget * 80)/100.0;
                    nastanqvane = "Hut";
                    town = "Alaska";
                } else if (budget > 3000) {
                    budgetFinal = (budget * 90)/100.0;
                    nastanqvane = "Hotel";
                    town = "Alaska";
                }
                break;
            case "Winter":
                if (budget <= 1000) {
                    budgetFinal = (budget * 45)/100.0;
                    nastanqvane = "Camp";
                    town = "Morocco";
                } else if (budget > 1000 && budget <= 3000) {
                    budgetFinal = (budget * 60)/100.0;
                    nastanqvane = "Hut";
                    town = "Morocco";
                } else if (budget > 3000) {
                    budgetFinal = (budget * 90)/100.0;
                    nastanqvane = "Hotel";
                    town = "Morocco";
                }
                break;
        }
        System.out.printf("%s - %s - %.2f", town, nastanqvane, budgetFinal);
    }
}
