import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            String twoInOne = in.next();
            if (twoInOne.length() % 2 != 0) {
                System.out.println("-1");
                continue;
            }
            int corrections = 0;
            String firstString = twoInOne.substring(0,twoInOne.length() / 2);
            String secondString = twoInOne.substring(twoInOne.length() / 2, twoInOne.length());
            int[] firstStringUsed = new int[26];
            int[] secondStringUsed = new int[26];
            for (int j = 0; j < firstString.length(); j++) {
                int intValue = firstString.charAt(j) - 'a';
                int intValueSecond = secondString.charAt(j) - 'a';
                firstStringUsed[intValue]++;
                secondStringUsed[intValueSecond]++;
            }

            for (int j = 0; j < firstStringUsed.length; j++) {
                if (firstStringUsed[j] < secondStringUsed[j]) {
                    corrections += Math.abs(firstStringUsed[j] - secondStringUsed[j]);
                }
            }
            System.out.println(corrections);
        }
    }
}
