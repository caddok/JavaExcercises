import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gameNumber = in.nextInt();
        int multiplicatedDigits = 1;
        int sumOfDigits = 0;
        int getLast = 10;
        while (gameNumber > 0) {
            int digit = gameNumber % getLast;
            if (digit == 1) {
                if (multiplicatedDigits == 1) {
                    multiplicatedDigits = 0;
                    multiplicatedDigits += digit;
                }
                else {
                    multiplicatedDigits += digit;
                }
                sumOfDigits += digit;
            }
            else {
                multiplicatedDigits *= digit;
                sumOfDigits += digit;
            }
            gameNumber /= 10;
        }
        if (multiplicatedDigits > sumOfDigits) {
            System.out.println(multiplicatedDigits);
        }
        else {
            System.out.println(sumOfDigits);
        }
    }
}
