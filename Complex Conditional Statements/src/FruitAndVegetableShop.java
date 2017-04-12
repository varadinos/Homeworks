import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/28/2017.
 */
public class FruitAndVegetableShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double qty = Double.parseDouble(scanner.nextLine());
        double price = -1;

        boolean isWeek = day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
                day.equals("thursday") || day.equals("friday");

        boolean isWeekend = day.equals("saturday") || day.equals("sunday");

        if (isWeek) {
            switch (fruit) {
                case "banana":
                    price = 2.50;
                    System.out.println(price * qty);
                    break;
                case "apple":
                    price = 1.2;
                    System.out.println(price * qty);
                    break;
                case "orange":
                    price = 0.85;
                    System.out.println(price * qty);
                    break;
                case "grapefruit":
                    price = 1.45;
                    System.out.println(price * qty);
                    break;
                case "kiwi":
                    price = 2.7;
                    System.out.println(price * qty);
                    break;
                case "pineapple":
                    price = 5.50;
                    System.out.println(price * qty);
                    break;
                case "grapes":
                    price = 3.85;
                    System.out.println(price * qty);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (isWeekend) {
            switch (fruit) {
                case "banana":
                    price = 2.70;
                    System.out.println(price * qty);
                    break;
                case "apple":
                    price = 1.25;
                    System.out.println(price * qty);
                    break;
                case "orange":
                    price = 0.90;
                    System.out.println(price * qty);
                    break;
                case "grapefruit":
                    price = 1.60;
                    System.out.println(price * qty);
                    break;
                case "kiwi":
                    price = 3;
                    System.out.println(price * qty);
                    break;
                case "pineapple":
                    price = 5.60;
                    System.out.println(price * qty);
                    break;
                case "grapes":
                    price = 4.2;
                    System.out.println(price * qty);
                    break;
                default:
                    System.out.println("error");
            }
        } else {
            System.out.println("error");
        }


    }
}
