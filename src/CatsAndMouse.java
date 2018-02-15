import java.util.ArrayList;
import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfQueries = in.nextInt();
        int catA;
        int catB;
        int mouse;
        ArrayList<String> answers = new ArrayList<>();
        for (int i = 0; i < numberOfQueries; i++) {
            catA = in.nextInt();
            catB = in.nextInt();
            mouse = in.nextInt();
            if (Math.abs(catA-mouse) > Math.abs(catB - mouse)) {
                answers.add("Cat B");
            }
            else if (Math.abs(catA - mouse) < Math.abs(catB - mouse)) {
                answers.add("Cat A");
            }
            else {
                answers.add("Mouse C");
            }
        }
        for (String answer : answers ) {
            System.out.println(answer);
        }
    }
}
