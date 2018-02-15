import java.util.ArrayList;
import java.util.Scanner;

public class ADsEverywhere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int daysToAdvertise = in.nextInt();

        ArrayList<Long> dayByDay = new ArrayList<>();
        long people = 5;
        long peopleWhoLike = 0;

        for (int i = 0; i < daysToAdvertise; i++) {
            peopleWhoLike = people / 2;
            dayByDay.add(peopleWhoLike);
            people = peopleWhoLike * 3;
        }
        peopleWhoLike = 0;
        for (int i = 0; i < dayByDay.size(); i++) {
            long quantity = dayByDay.get(i);
            peopleWhoLike += quantity;
        }
        System.out.println(peopleWhoLike);
    }
}
