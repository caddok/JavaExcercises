import java.util.Scanner;

public class CloudGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfClouds = in.nextInt();
        int jump = in.nextInt();
        int[] clouds = new int[numberOfClouds];
        for (int i = 0; i < clouds.length; i++) {
            clouds[i] = in.nextInt();
        }

        int energy = 100;
        int nextCloud = 0;
        for (int i = 0;; i = nextCloud) {
            nextCloud = (i + jump) % numberOfClouds;
            if (nextCloud == 0) {
                if (clouds[nextCloud] == 0) {
                    energy--;
                }
                else {
                    energy -= 3;
                }
                System.out.println(energy);
                break;
            }
            if (clouds[nextCloud] == 0) {
                energy--;
            }
            else {
                energy -= 3;
            }
        }
    }
}
