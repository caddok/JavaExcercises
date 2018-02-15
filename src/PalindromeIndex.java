import java.util.Scanner;

public class PalindromeIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        int index = 0;
        for (int j = 0; j < testCases; j++) {
            String input = in.next();
            StringBuilder sb = new StringBuilder(input);
            boolean found = false;
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    sb.deleteCharAt(i);
                    if (isPalindrome(sb) == true) {
                        index = i;
                        found = true;
                        break;
                    }
                    else {
                        index = input.length() - i - 1;
                        found = true;
                        break;
                    }
                }
            }
            if (found == false) {
                System.out.println("-1");
            }
            else {
                System.out.println(index);
            }
        }
    }
    public static boolean isPalindrome (StringBuilder sb) {
        boolean palindrome = true;
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
