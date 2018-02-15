import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            String firstString = in.next();
            String secondString = in.next();

            boolean found = false;
            int[] firstUsed = new int[26];
            int[] secondUsed = new int[26];
            for (int j = 0; j < firstString.length(); j++) {
                int intVal = firstString.charAt(j) - 'a';
                firstUsed[intVal]++;
            }

            for (int j = 0; j < secondString.length(); j++) {
                int intVal = secondString.charAt(j) - 'a';
                secondUsed[intVal]++;
            }

            for (int j = 0; j < firstUsed.length; j++) {
                if (firstUsed[j] != 0 && secondUsed[j] != 0) {
                    found = true;
                    break;
                }
            }

            if (found == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}