import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = in.nextInt();
            int coefficient = in.nextInt();
            ArrayList<Integer> firstArray = new ArrayList<>();
            for (int j = 0; j < arraySize; j++) {
                firstArray.add(in.nextInt());
            }
            ArrayList<Integer> secondArray = new ArrayList<>();
            for (int j = 0; j < arraySize; j++) {
                secondArray.add(in.nextInt());
            }
            boolean isItPossible = possible(firstArray,secondArray,coefficient);
            if (isItPossible == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static boolean possible(ArrayList<Integer> first, ArrayList<Integer> second, int coef) {
        boolean possible = true;
        int mostPopularElement = 0;
        int popularity = 0;
        first.sort(Comparator.naturalOrder());
        second.sort(Comparator.naturalOrder());
        boolean[] used = new boolean[first.size()];
        boolean[] usedFromSecond = new boolean[first.size()];

        for (int i = 0; i < first.size(); i++) {
            if (first.get(i) + second.get(i) < coef) {
                int result = 0;
                for (int j = i + 1; j < second.size(); j++) {
                    if (first.get(i) + second.get(j) >= coef && usedFromSecond[j] == false) {
                        usedFromSecond[j] = true;
                        result = first.get(i) + second.get(j);
                        break;
                    }
                }
                if (result == 0) {
                    possible = false;
                    break;
                }
            }
            else {
                usedFromSecond[i] = true;
                used[i] = true;
            }
        }

        return possible;
    }
}
