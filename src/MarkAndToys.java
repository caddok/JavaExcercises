import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MarkAndToys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfToys = in.nextInt();
        int moneyToSpend = in.nextInt();
        ArrayList<Integer> toys = new ArrayList<>();
        for (int i = 0; i < numberOfToys; i++) {
            toys.add(in.nextInt());
        }
        int toyNumber = 0;
        long moneySpend = 0;
        int toysBought = 0;
        toys.sort(Comparator.naturalOrder());
        while (moneySpend <= moneyToSpend) {
            if (moneySpend + toys.get(toyNumber) > moneyToSpend) {
                break;
            }
            moneySpend += toys.get(toyNumber);
            toyNumber++;
            toysBought++;
        }
        System.out.println(toysBought);
    }
}
