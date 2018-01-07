import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int startPoint = in.nextInt();
        int endPoint = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int appleCount = in.nextInt();
        int orangeCount = in.nextInt();

        int[] apples = new int[appleCount];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = in.nextInt();
        }

        int[] oranges = new int[orangeCount];
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = in.nextInt();
        }

        int orangesHit = 0;
        int applesHit = 0;

        for (int i = 0; i < apples.length; i++) {
            if (appleTree + apples[i] >= startPoint && appleTree + apples[i] <= endPoint){
                applesHit++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            if (orangeTree + oranges[i] >= startPoint && orangeTree + oranges[i] <= endPoint){
                orangesHit++;
            }
        }

        System.out.println(applesHit);
        System.out.println(orangesHit);
    }
}
