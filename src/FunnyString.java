import java.util.ArrayList;
import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();


        for (int i = 0; i < testCases; i++) {
            String input = in.next();
            StringBuilder sb = new StringBuilder(input);
            String reverseInput = String.valueOf(sb.reverse());
            for (int j = 1; j < input.length(); j++) {
                int firstChar = input.charAt(j) - 96;
                int secondChar = input.charAt(j - 1) -96;
                int reverseFirstChar = reverseInput.charAt(j) - 96;
                int reverseSecondChar = reverseInput.charAt(j - 1) - 96;

                if (Math.abs(firstChar - secondChar) == Math.abs(reverseFirstChar - reverseSecondChar)) {
                    if (j == input.length() - 1) {
                        System.out.println("Funny");
                    }
                }
                else {
                    System.out.println("Not Funny");
                    break;
                }
            }
        }
    }
}
