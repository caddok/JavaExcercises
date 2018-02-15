import java.util.ArrayList;
import java.util.Scanner;

public class GridChallenge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 1; i <= testCases; i++) {
            int sizeOfGrid = in.nextInt();
            String[] grid = new String[sizeOfGrid];
            ArrayList<String> orderedGrid = new ArrayList<>();
            boolean possible = true;
            for (int j = 0; j < sizeOfGrid; j++) {
                grid[j] = in.next();
                orderedGrid.add(bringOrder(grid[j]));
            }

            for (int j = 0; j < orderedGrid.size() - 1; j++) {
                String eval = orderedGrid.get(j);
                String eval2 = orderedGrid.get(j + 1);
                int pos = 0;
                while (pos < eval.length()) {
                    int intVal1 = eval.charAt(pos) - 'a';
                    int intVal2 = eval2.charAt(pos) - 'a';
                    if (intVal1 > intVal2) {
                        possible = false;
                        break;
                    }
                    pos++;
                }
                if (possible == false) {
                    break;
                }
            }
            if (possible == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }


    }
    public static String bringOrder(String input) {
        String orderedString = null;
        int[] alphabet = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int intVal = input.charAt(i) - 'a';
            alphabet[intVal]++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 0) {
                continue;
            }
            if (alphabet[i] == 1) {
                sb.append((char) (i + 'a'));
            }
            else {
                int countOfLetters = alphabet[i];
                while (countOfLetters > 0) {
                    sb.append((char) (i + 'a'));
                    countOfLetters--;
                }
            }
        }
        orderedString = sb.toString();
        return orderedString;
    }
}
