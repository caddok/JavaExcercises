import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LuckBalance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contests = in.nextInt();
        int loosableImportant = in.nextInt();
        int[][] contestLuckAndImportance = new int[contests][2];
        int luck = 0;
        for (int i = 0; i < contests; i++) {
            for (int j = 0; j < 2; j++) {
                contestLuckAndImportance[i][j] = in.nextInt();
            }
            for (int j = i; j < i + 1; j++) {
                if (contestLuckAndImportance[j][1] == 0) {
                    luck += contestLuckAndImportance[j][0];
                }
            }
        }
        int importantContestsLost = 0;
        ArrayList<Integer> luckBalance = returnOrderOfLuck(contestLuckAndImportance);

        for (int i = 0; i < luckBalance.size(); i++) {
            if (importantContestsLost < loosableImportant) {
                luck += luckBalance.get(i);
                importantContestsLost++;
            }
            else {
                luck -= luckBalance.get(i);
            }
        }
        System.out.println(luck);
    }
    public static ArrayList<Integer> returnOrderOfLuck(int[][] matrix) {
        ArrayList<Integer> luck = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][1] == 1) {
                luck.add(matrix[i][0]);
            }
        }
        luck.sort(Comparator.reverseOrder());
        return luck;
    }

}
