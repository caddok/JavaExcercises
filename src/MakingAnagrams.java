import java.util.Scanner;

public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstString = in.next();
        String secondString = in.next();

        int result = 0;
        int[] lettersUsed = new int[26];
        for (int i = 0; i < firstString.length(); i++) {
            int intVal = firstString.charAt(i) - 'a';
            lettersUsed[intVal]++;
        }
        for (int i = 0; i < secondString.length(); i++) {
            int intVal = secondString.charAt(i) - 'a';
            lettersUsed[intVal]--;
        }
        for (int i = 0; i < lettersUsed.length; i++) {
            result += Math.abs(lettersUsed[i]);
        }
        System.out.println(result);
    }
}
