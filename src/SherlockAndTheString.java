        import java.lang.reflect.Array;
        import java.util.*;

        public class SherlockAndTheString {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String input = in.next();

                int[] lettersUsed = new int[26];
                for (int i = 0; i < input.length(); i++) {
                    int intVal = input.charAt(i) - 'a';
                    lettersUsed[intVal]++;
                }

                int mostCommon = getMostCommon(lettersUsed);
                int deleted = 0;
                for (int i = 0; i < lettersUsed.length; i++) {
                    if (lettersUsed[i] != 0 && lettersUsed[i] != mostCommon) {
                        if (lettersUsed[i] > 1) {
                            deleted += Math.abs(lettersUsed[i] - mostCommon);
                        }
                        else {
                            deleted += lettersUsed[i];
                        }
                    }
                }

                if (deleted <= 1) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            public static int getMostCommon(int[] rare) {
                int mostCommon = 0;
                int occurance = 0;
                for (int i = 0; i < rare.length; i++) {
                    int tempCommon = rare[i];
                    int tempOcurrance = 0;
                    if (rare[i] != 0 && tempCommon != mostCommon) {
                        for (int j = 0; j < rare.length; j++) {
                            if (rare[j] == tempCommon) {
                                tempOcurrance++;
                            }
                        }
                    }
                    if (tempOcurrance > occurance) {
                        mostCommon = tempCommon;
                        occurance = tempOcurrance;
                    }
                }
                return mostCommon;
            }
        }
