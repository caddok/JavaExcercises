import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MarcCakeWalk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cupcakes = in.nextInt();
        ArrayList<Integer> calories = new ArrayList<>();
        for (int i = 0; i < cupcakes; i++) {
            calories.add(in.nextInt());
        }
        long miles = 0;
        calories.sort(Comparator.reverseOrder());
        for (int i = 0; i < calories.size(); i++) {
            miles += (calories.get(i) * (Math.pow(2,i)));
        }
        System.out.println(miles);
    }
}
