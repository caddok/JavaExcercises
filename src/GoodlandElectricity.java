import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GoodlandElectricity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfCities = in.nextInt();
        int towerRange = in.nextInt();
        ArrayList<Integer> towerPositions = new ArrayList<>();
        for (int i = 0; i < numberOfCities; i++) {
            int value = in.nextInt();
            if (value == 1) {
                towerPositions.add(i);
            }
        }
        int positionOfCityWithTower = towerPositions.get(0);
        int towersSwitched = 0;
        int optimalTowerPosition = towerRange;
        if (positionOfCityWithTower > towerRange) {
            towersSwitched = -1;
        }
        else {
            while (positionOfCityWithTower + towerRange + 1 < numberOfCities) {
                positionOfCityWithTower = findOptimalTowerPosition(towerPositions, optimalTowerPosition,
                        towerPositions.indexOf(positionOfCityWithTower) + 1);
                optimalTowerPosition = (2 * (towerRange - 1)) + positionOfCityWithTower;
                towersSwitched++;
            }
        }
        System.out.println(towersSwitched);
    }
    public static int findOptimalTowerPosition(ArrayList<Integer> positions,int optimalPosition, int startPos) {
        int position = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = startPos; i < positions.size(); i++) {
            if (positions.get(i) > optimalPosition) {
                break;
            }
            if (positions.get(i) <= optimalPosition) {
                int temp = Math.abs(optimalPosition - positions.get(i));
                if (temp < minDiff) {
                    minDiff = temp;
                    position = positions.get(i);
                }
            }
        }
        return position;
    }
}
