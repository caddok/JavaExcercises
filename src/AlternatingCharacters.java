import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            String input = in.next();
            int deletions = 0;

            for (int j = 0; j < input.length() - 1; j++) {
                char next = input.charAt(j + 1);
                if (next != input.charAt(j)) {
                    continue;
                }
                else {
                    deletions++;
                }
            }
            System.out.println(deletions);
        }

    }
}
