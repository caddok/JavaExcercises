import java.util.Scanner;

public class GameOfThrones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        int[] lettersUsed = new int[26];

        for (int i = 0; i < inputString.length(); i++) {
            int intValue = inputString.charAt(i) - 'a';
            lettersUsed[intValue]++;
        }
        if (inputString.length() % 2 == 0) {
            boolean palindrome = false;
            for (int i = 0; i < lettersUsed.length; i++) {
                if (lettersUsed[i] % 2 != 0) {
                    palindrome = false;
                    break;
                }
                else {
                    palindrome = true;
                }
            }
            if (palindrome == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            int oddCount = 0;
            for (int i = 0; i < lettersUsed.length; i++) {
                if (oddCount > 1) {
                    break;
                }
                if (lettersUsed[i] % 2 != 0) {
                    oddCount++;
                }
            }
            if (oddCount > 1) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
