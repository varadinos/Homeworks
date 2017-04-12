import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/11/2017.
 */
public class p014 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String dateStr = console.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateStr, dtf);
        date = date.plusDays(999);
        System.out.println(date.format(dtf));

    }
}
