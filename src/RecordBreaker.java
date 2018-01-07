import java.util.Scanner;

public class RecordBreaker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int games = in.nextInt();
        int[] scores = new int[games];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = in.nextInt();
        }

        int maxScore = scores[0];
        int minScore = scores[0];
        int maxScoreBreaks = 0;
        int minScoreBreaks = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore)
            {
                maxScoreBreaks++;
                maxScore = scores[i];
            }
            else if (scores[i] < minScore)
            {
                minScoreBreaks++;
                minScore = scores[i];
            }
        }
        System.out.println(maxScoreBreaks + " " + minScoreBreaks);
    }
}
