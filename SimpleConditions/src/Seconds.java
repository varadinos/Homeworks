import java.util.Scanner;

/**
 * Created by Stoyan Varadinov on 3/19/2017.
 */
public class Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = Integer.parseInt(scanner.nextLine());
        int s2 = Integer.parseInt(scanner.nextLine());
        int s3 = Integer.parseInt(scanner.nextLine());
        int mins = 0;
        int sumS = s1 + s2 + s3;
        int sec = sumS - 60;
        int sec2 = sumS - 120;

        if (sumS <= 59 && sumS >= 10) {
            System.out.println("0:" + sumS);
        }
        if (sumS >=60 && sumS <=119 && sec <= 9){
            mins = mins +1;
            System.out.println(mins + ":0" + sec);
        } else if (sumS >=60 && sumS <=119 && sec >=10){
            mins = mins + 1;
            System.out.println(mins + ":" + sec);
        }
        if (sumS >=120 && sumS <= 179 && sec2 <=9){
            mins = mins + 2;
            System.out.println(mins + ":0" + sec2);
        } else if (sumS >=120 && sumS <= 179 && sec2 >= 10){
            mins = mins + 2;
            System.out.println(mins + ":" + sec2);
        }
        if (sumS < 10){
            System.out.println("0:0" + sumS);
        }
    }
}
