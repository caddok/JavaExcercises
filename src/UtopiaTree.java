import java.util.ArrayList;
import java.util.Scanner;

public class UtopiaTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        int[] testCases = new int[numberOfTestCases];
        for (int i = 0; i < testCases.length; i++) {
            testCases[i] = in.nextInt();
        }
        ArrayList<Integer> afterNCycles = new ArrayList<>();

        for (int i = 0; i < testCases.length; i++) {
            int testCase = testCases[i];
            int treeHeigth = 1;
            if (testCase == 0) {
                afterNCycles.add(treeHeigth);
                continue;
            }
            int cycle = 1;
            while (cycle <= testCase) {
                if (cycle % 2 != 0) {
                    treeHeigth *= 2;
                }
                else {
                    treeHeigth++;
                }
                cycle++;
            }
            afterNCycles.add(treeHeigth);
        }

        for (int i = 0; i < afterNCycles.size(); i++) {
            int heigth = afterNCycles.get(i);
            System.out.println(heigth);
        }
    }
}
