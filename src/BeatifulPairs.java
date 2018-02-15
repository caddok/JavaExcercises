import java.util.Scanner;

public class BeatifulPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 1000;
        int count = in.nextInt();
        int[] first = new int[max + 1];
        for (int i = 0; i < count; i++) {
            first[i] = in.nextInt();
        }
        int beatifulPairs = 0;
        int[] second = new int[max + 1];
        for (int i = 0; i < count; i++) {
            int num = in.nextInt();
            if (first[num] > 0) {
                first[num]--;
                beatifulPairs++;
            }
        }
        if (beatifulPairs == count) {
            beatifulPairs--;
        }
        else {
            beatifulPairs++;
        }
        System.out.println(beatifulPairs);
    }
}
