import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayCount = in.nextInt();
        int rotationsToPerform = in.nextInt();
        int numberOfQueries = in.nextInt();
        int[] array = new int[arrayCount];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        int startPosition = (array.length + ((-1 * rotationsToPerform) % (array.length))) % array.length;

        for (int i = 0; i < numberOfQueries; i++) {
            int query = in.nextInt();
            System.out.println(array[(startPosition + query) % (array.length)]);
        }



    }
}
