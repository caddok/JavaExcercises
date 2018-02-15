import java.util.Scanner;

public class StringConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            String inputString = in.next();
            int result = 0;
            int[] lettersUsed = new int[26];

            for (int j = 0; j < inputString.length(); j++) {
                int intVal = inputString.charAt(j) - 'a';
                lettersUsed[intVal]++;
            }

            for (int j = 0; j < lettersUsed.length; j++) {
                if (lettersUsed[j] > 0) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
