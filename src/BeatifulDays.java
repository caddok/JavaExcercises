import java.util.Scanner;

public class BeatifulDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startDay = in.nextInt();
        int endDay = in.nextInt();
        int divider = in.nextInt();

        int beatifulDays = 0;
        for (int i = startDay; i <= endDay ; i++) {
            int day = i;
            int reversedNum = 0;
            int lastDigit;
            while (day != 0) {
                lastDigit = day % 10;
                reversedNum = reversedNum * 10 + lastDigit;
                day /= 10;
            }
            if (Math.abs(i - reversedNum) % divider == 0) {
                beatifulDays++;
            }
        }
        System.out.println(beatifulDays);
    }
}
