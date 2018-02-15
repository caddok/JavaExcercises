import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int steps = in.nextInt();
        String path = in.next();

        int valleysCrossed = 0;
        int seaLvl = 0;
        boolean belowSeaLvl = false;

        for (int i = 0; i < path.length() - 1; i++) {
            if (path.charAt(i) == 'D'){
                seaLvl--;
            }
            else {
                seaLvl++;
            }
            if (!belowSeaLvl && seaLvl < 0) {
                valleysCrossed++;
                belowSeaLvl = true;
            }
            if (seaLvl >= 0) {
                belowSeaLvl = false;
            }
        }
        System.out.println(valleysCrossed);
    }
}
