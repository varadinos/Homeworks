import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/25/2017.
 */
public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (town.equalsIgnoreCase("sofia")) {

            if (product.equalsIgnoreCase("coffee")) {
                price = quantity * 0.5;
            } else if (product.equalsIgnoreCase("water")) {
                price = quantity * 0.8;
            } else if (product.equalsIgnoreCase("beer")) {
                price = quantity * 1.2;
            } else if (product.equalsIgnoreCase("sweets")) {
                price = quantity * 1.45;
            } else if (product.equalsIgnoreCase("peanuts")) {
                price = quantity * 1.6;
            }

        } else if (town.equalsIgnoreCase("plovdiv")) {

            if (product.equalsIgnoreCase("coffee")) {
                price = quantity * 0.4;
            } else if (product.equalsIgnoreCase("water")) {
                price = quantity * 0.7;
            } else if (product.equalsIgnoreCase("beer")) {
                price = quantity * 1.15;
            } else if (product.equalsIgnoreCase("sweets")) {
                price = quantity * 1.30;
            } else if (product.equalsIgnoreCase("peanuts")) {
                price = quantity * 1.5;
            }

        } else if (town.equalsIgnoreCase("varna")) {

            if (product.equalsIgnoreCase("coffee")) {
                price = quantity * 0.45;
            } else if (product.equalsIgnoreCase("water")) {
                price = quantity * 0.7;
            } else if (product.equalsIgnoreCase("beer")) {
                price = quantity * 1.1;
            } else if (product.equalsIgnoreCase("sweets")) {
                price = quantity * 1.35;
            } else if (product.equalsIgnoreCase("peanuts")) {
                price = quantity * 1.55;
            }
        }
        
        System.out.println(price);
    }
}
