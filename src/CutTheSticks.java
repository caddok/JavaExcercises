import java.util.Scanner;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] sticks = new int[count];
        for (int i = 0; i < sticks.length; i++) {
            sticks[i] = in.nextInt();
        }
        int numberOfZeroes = 0;

        for ( ; ;) {
            int smallest = 0;

            for (int i = 0; i < sticks.length; i++) {
                int tempMin = sticks[i];
                if(sticks[i] != 0 && smallest == 0) {
                    smallest = sticks[i];
                }
                else if (tempMin < smallest && tempMin != 0) {
                    smallest = tempMin;
                }
            }
            System.out.println(sticks.length - numberOfZeroes);
            for (int i = 0; i < sticks.length; i++) {
                if (sticks[i] == 0 ) {
                    continue;
                }
                sticks[i] -= smallest;
                if (sticks[i] == 0) {
                    numberOfZeroes++;
                }
            }
            if (numberOfZeroes == sticks.length) {
                break;
            }
        }




    }
}
