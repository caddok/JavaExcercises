import java.util.Scanner;

public class SeparateTheNumbers {
    static long firstX = -1;

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int numberOfQueeries = in.nextInt();

        for (int i = 0; i < numberOfQueeries; i++) {
            String input = in.next();
            boolean valid = false;
            for (int j = 1; j <= input.length() / 2; j++) {
                String matchingWord = generateMatchingWord(input, j);
                if (matchingWord.equals(input)) {
                    valid = true;
                    break;
                }
            }
            System.out.println(valid ? "YES " + firstX : "NO");
        }
    }

    private static String generateMatchingWord(String input, int j) {
        long x = Long.parseLong(input.substring(0,j));
        firstX = x;
        String test = Long.toString(x);
        while (test.length() < input.length()) {
            test += Long.toString(++x);
        }

        return test;
    }
}
