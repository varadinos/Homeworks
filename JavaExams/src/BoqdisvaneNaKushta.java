import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 4/1/2017.
 */
public class BoqdisvaneNaKushta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double pzstrana = 2 * (x * x);
        double ldstrana = 2 * (x * y);
        double vrata = 1.2 * 2;
        double prozorci = 2 * (1.5*1.5);

        double pokrivPravougulnici = 2 * (x *y);
        double pokrivTriugulnici = 2 * (x * h/2);

        double zelena = ((pzstrana + ldstrana) - (vrata + prozorci)) / 3.4;
        double chervena = (pokrivPravougulnici + pokrivTriugulnici) / 4.3;

        System.out.printf("%.2f%n", zelena);
        System.out.printf("%.2f%n", chervena);

    }
}
