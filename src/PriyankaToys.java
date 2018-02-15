import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PriyankaToys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfToys = in.nextInt();
        ArrayList<Integer> weightOfToys = new ArrayList<>();
        for (int i = 0; i < numberOfToys; i++) {
            weightOfToys.add(in.nextInt());
        }
        int toyPurchased = 1;
        weightOfToys.sort(Comparator.naturalOrder());

        int purchasedToy = weightOfToys.get(0);
        for (int i = 0; i <= weightOfToys.size() - 1;) {
            int nextToy = weightOfToys.get(i);
            if (purchasedToy + 4 >= nextToy) {
                i++;
                continue;
            }
            else {
                purchasedToy = weightOfToys.get(i);
                toyPurchased++;
                i++;
            }
        }
        System.out.println(toyPurchased);
    }
}
