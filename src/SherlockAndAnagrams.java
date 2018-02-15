import java.util.Scanner;

public class SherlockAndAnagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            String input = in.next();
            int pairs = getPairs(input);

            int initSize = 2;
            while (initSize < input.length()) {
                for (int j = 0;;) {
                    if (j + initSize > input.length() - 1) {
                        break;
                    }
                    int index = j;
                    StringBuilder firstPart = getString(initSize,input,j);
                    while (index + initSize < input.length()) {
                        index++;
                        StringBuilder secondPart = getString(initSize, input, index);
                        if (isItAnagram(firstPart, secondPart) == true) {
                            pairs++;
                        }
                    }
                    j+=initSize;
                }
                initSize++;
            }
            System.out.println(pairs);
        }
    }
    public static StringBuilder getString(int size,String input,int index) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() != size) {
            sb.append(input.charAt(index));
            index++;
        }
        return sb;
    }
   /* public static StringBuilder getSecondString(int size, String input, int index) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() != size) {
            sb.append(input.charAt(input.length() - index - 1));
            index++;
        }
        return sb;
    }*/
    public static int getPairs(String input) {
        int pairs =0;
        int[] alphabet = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int intVal = input.charAt(i) - 'a';
            alphabet[intVal]++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] != 0 && alphabet[i] % 2 == 0) {
                pairs++;
            }
        }
        return pairs;
    }
    public static boolean isItAnagram(StringBuilder firstString, StringBuilder secondString) {
        boolean anagram = true;
        int[] firstUsed = new int[26];
        int[] secondUsed = new int[26];
        for (int i = 0; i < firstString.length(); i++) {
            int invVal1 = firstString.charAt(i) - 'a';
            int invVal2 = secondString.charAt(i) - 'a';
            firstUsed[invVal1]++;
            secondUsed[invVal2]++;
        }
        for (int i = 0; i < firstUsed.length; i++) {
            if (firstUsed[i] != secondUsed[i]) {
                anagram = false;
                break;
            }
        }
        return anagram;
    }
}
