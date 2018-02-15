import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GreedyFlorist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfFlowers = in.nextInt();
        int numberOfFriends = in.nextInt();
        ArrayList<Integer> flowerPrices = new ArrayList<>();
        for (int i = 0; i < numberOfFlowers; i++) {
            flowerPrices.add(in.nextInt());
        }
        int sum = 0;
        if (numberOfFlowers == numberOfFriends) {
            for (int i = 0; i < flowerPrices.size(); i++) {
                sum += flowerPrices.get(i);
            }
        }
        else {
            sum = getOptimalSum(flowerPrices,numberOfFriends);
        }
        System.out.println(sum);
    }
    public static int getOptimalSum(ArrayList<Integer> prices, int friendsCount) {
        int sum = 0;
        int flowersPerPerson = prices.size() / friendsCount;
        prices.sort(Comparator.reverseOrder());
        boolean[] alreadyBought = new boolean[prices.size()];

        if (prices.size() % friendsCount == 0) {
            for (int i = 0; i < friendsCount; i++) {
                int flowersPurchased = 0;
                for (int j = i;flowersPurchased < flowersPerPerson;j += friendsCount) {
                    sum += (flowersPurchased + 1) * prices.get(j);
                    flowersPurchased++;
                }
            }
        }
        else {
            int remainder = prices.size() % friendsCount;
            for (int i = 0; i < friendsCount; i++) {
                flowersPerPerson = prices.size() / friendsCount;
                int flowersPurchased = 0;
                if (i < remainder) {
                    flowersPerPerson++;
                }

                for (int j = i;flowersPurchased < flowersPerPerson;j += friendsCount) {
                    sum += (flowersPurchased + 1) * prices.get(j);
                    flowersPurchased++;
                    alreadyBought[j] = true;
                }
            }
        }
        return sum;
    }
}
