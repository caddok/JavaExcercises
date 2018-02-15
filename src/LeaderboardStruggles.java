import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LeaderboardStruggles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPlayers = in.nextInt();
        int[] playerScores = new int[numberOfPlayers + 1];
        for (int i = 1; i < playerScores.length; i++) {
            playerScores[i] = in.nextInt();
        }
        int beatenLvls = in.nextInt();
        int[] aliceScores = new int[beatenLvls];
        for (int i = 0; i < aliceScores.length; i++) {
            aliceScores[i] = in.nextInt();
        }
        ArrayList<Integer> ranks = new ArrayList<>(numberOfPlayers);
        ranks.add(0,0);
        for (int i = 1; i < playerScores.length; i++) {
            int nextRank = (ranks.size() - 1) + 1;
               if (ranks.get(ranks.size() - 1) == playerScores[i]) {
                    continue;
                }
                else {
                    ranks.add(nextRank, playerScores[i]);
                 }
        }
        ArrayList<Integer> aliceRanks = new ArrayList<>();
        int currentRank = ranks.size() - 1;
        for (int i = 0; i < aliceScores.length; i++) {
            if (aliceScores[i] < ranks.get(currentRank)) {
                aliceRanks.add(currentRank + 1);
                continue;
            }
            while (aliceScores[i] > ranks.get(currentRank)) {
                if (currentRank == 1 && aliceScores[i] > ranks.get(currentRank)) {
                    aliceRanks.add(currentRank);
                    break;
                }
                currentRank--;
            }
            if (aliceScores[i] < ranks.get(currentRank)) {
                aliceRanks.add(currentRank + 1);
            }
            if (aliceScores[i] == ranks.get(currentRank)) {
                aliceRanks.add(currentRank);
            }
        }

        for (int i = 0; i < aliceRanks.size(); i++) {
            int rank = aliceRanks.get(i);
            System.out.println(rank);
        }



    }
}
