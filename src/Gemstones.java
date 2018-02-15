import java.util.*;

public class Gemstones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stones = in.nextInt();

        int[] countOfGems = new int[26];
        int gemstones = 0;

        for (int i = 0; i < stones; i++) {
            String input = in.next();

            Set<Character> baseSet = new HashSet<>();
            for (char ch : input.toCharArray()) {
                baseSet.add(ch);
            }
            for (int item : baseSet) {
                countOfGems[item - 'a']++;
            }
        }
        for (int gemCount : countOfGems) {
            if (gemCount == stones) {
                gemstones++;
            }
        }
        System.out.println(gemstones);
    }
}
