import java.util.ArrayList;
import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        int divisableDigits = 0;
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int fullNumber = in.nextInt();
            int number = fullNumber;
            while (number != 0) {
                int lastDigit = number % 10;
                if ( lastDigit != 0 && fullNumber % lastDigit == 0) {
                    divisableDigits++;
                }
                number = number / 10;
            }
            if (divisableDigits > 0) {
                results.add(divisableDigits);
            }
            divisableDigits = 0;
        }

        for (int i = 0; i < results.size(); i++) {
            int result = results.get(i);
            System.out.println(result);
        }
    }
}
