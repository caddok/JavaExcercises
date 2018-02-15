import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfCars = in.nextInt();
        ArrayList<Integer> cars = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(in.nextInt());
        }
        int bigSum = 0;
        int columnLength = 0;
        for (int i = 0; i < cars.size() - 1; i++) {
            int leadCar = cars.get(i);
            int tempLength = 1;
            int tempSum = leadCar;
            while (leadCar < cars.get(i + 1)) {
                tempLength++;
                tempSum += cars.get(i + 1);
                i++;
                if (i >= cars.size() - 1) {
                    break;
                }
            }
            if (tempLength > columnLength) {
                columnLength = tempLength;
                bigSum = tempSum;
            }
            else if (tempLength == columnLength) {
                if (tempSum > bigSum) {
                    bigSum = tempSum;
                }
            }
        }
        System.out.println(bigSum);

    }
}
