import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/28/2017.
 */
public class TradeComissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        double commision = -1;

        if (town.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {

                commision = 0.05;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 500 && sales <= 1000) {

                commision = 0.07;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 1000 && sales <= 10000) {

                commision = 0.08;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 10000) {

                commision = 0.12;
                System.out.printf("%.2f", sales * commision);

            } else if (sales < 0) {

                System.out.println("error");
            }
        } else if (town.equals("varna")) {
            if (sales >= 0 && sales <= 500) {

                commision = 0.045;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 500 && sales <= 1000) {

                commision = 0.075;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 1000 && sales <= 10000) {

                commision = 0.10;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 10000) {

                commision = 0.13;
                System.out.printf("%.2f", sales * commision);

            } else if (sales < 0) {

                System.out.println("error");
            }
        } else if (town.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {

                commision = 0.055;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 500 && sales <= 1000) {

                commision = 0.08;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 1000 && sales <= 10000) {

                commision = 0.12;
                System.out.printf("%.2f", sales * commision);

            } else if (sales > 10000) {

                commision = 0.145;
                System.out.printf("%.2f", sales * commision);

            } else if (sales < 0) {

                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }


    }

}
