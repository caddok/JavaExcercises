import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfElements = in.nextInt();
        int[] elements = new int[numberOfElements + 1];
        for (int i = 1; i < elements.length; i++) {
            int element = in.nextInt();
            elements[element] = i;
        }

        for (int i = 1; i < elements.length; i++) {
            System.out.println(elements[elements[i]]);
        }

    }
}
