import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/29/2017.
 */
public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double weekendsSofia = 48 - h;
        double games = (weekendsSofia * 3.0) / 4;

        double gamesHome = h;
        double gamesP = (p * 2.0) / 3;

        double allGames = games + gamesHome + gamesP;
        double leapGames = allGames * 1.15;

        if (year.equals("leap")) {
            System.out.println(Math.floor(leapGames));
        } else if (year.equals("normal")){
            System.out.println(Math.floor(allGames));
        }
    }
}
