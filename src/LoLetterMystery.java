import java.util.ArrayList;
import java.util.Scanner;

public class LoLetterMystery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            String message = in.next();
            int corrections = 0;

            for (int k = 0; k  < message.length() / 2; k++) {
                if (message.charAt(k) != message.charAt(message.length() - k - 1)) {
                    corrections += Math.abs(message.charAt(k) - (message.charAt(message.length() - k - 1)));
                }
            }
            int x = 0;
            int y = message.length() - 1;
            while(x < message.length() / 2 && y > message.length() / 2) {

            }

            System.out.println(corrections);
        }
    }
}


