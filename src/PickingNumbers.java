import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countOfNums = in.nextInt();
        boolean[] added = new boolean[countOfNums];
        int[] numbers = new int[countOfNums];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        ArrayList<Integer> pickedNumbers = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (Math.abs(numbers[i] - numbers[j])<=1 && added[j] == false) {
                    count++;
                    added[j] = true;
                    pickedNumbers.add(numbers[j]);
                }
                if (j == numbers.length - 1 && count > 1 && added[i] == false) {
                    added[i] = true;
                    pickedNumbers.add(numbers[i]);
                    count = 0;
                }
            }
        }
        count = 0;
        boolean[] notValid = new boolean[pickedNumbers.size()];
        pickedNumbers.sort(Comparator.naturalOrder());
        for (int i = 0; i < pickedNumbers.size(); i++) {
            int firstNum = pickedNumbers.get(i);
            for (int j = i+1; j < pickedNumbers.size(); j++) {
                int next = pickedNumbers.get(j);
                if (Math.abs(firstNum - next) > 1 && notValid[j] == false) {
                    count++;
                    notValid[j] = true;
                    break;
                }
            }
        }

        System.out.println(pickedNumbers.size() - count);

    }
}
