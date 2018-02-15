import java.util.Scanner;

public class HurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfHurdles = in.nextInt();
        int maxJumpNoDrugs = in.nextInt();
        int[] hurdles = new int[numberOfHurdles];
        for (int i = 0; i < hurdles.length; i++) {
            hurdles[i] = in.nextInt();
        }

        int maxHeight = 0;
        for (int i = 0; i < hurdles.length; i++) {
            int tempMax = hurdles[i];
            if (tempMax > maxHeight) {
                maxHeight = tempMax;
            }
        }

        if (maxHeight <= maxJumpNoDrugs){
            System.out.println("0");
        }
        else {
            System.out.println(maxHeight - maxJumpNoDrugs);
        }


    }
}
