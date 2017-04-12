import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/20/2017.
 */
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String object = scanner.nextLine();

        if (object.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.printf("%.3f", area);
        } else if (object.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = (a * b);
            System.out.printf("%.3f", area);
        } else if (object.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * r * r;
            System.out.printf("%.3f", area);
        } else if (object.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double area = (a * h)/2;
            System.out.printf("%.3f", area);
        } else {
            System.out.println("Wrong input!");
        }
    }
}
