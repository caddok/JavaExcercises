import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MaxPerimTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfSticks = in.nextInt();
        ArrayList<Integer> sticks = new ArrayList<>();
        for (int i = 0; i < numberOfSticks; i++) {
            sticks.add(in.nextInt());
        }
        sticks.sort(Comparator.reverseOrder());
        ArrayList<Integer> maxTriangle = isItTriangle(sticks);
        if (maxTriangle.size() == 0) {
            System.out.println("-1");
        }
        else {
            System.out.println(maxTriangle.get(0) + " " + maxTriangle.get(1) + " " + maxTriangle.get(2));
        }
    }

    public static ArrayList<Integer> isItTriangle(ArrayList<Integer> triangle) {
        ArrayList<Integer> maxTriangle = new ArrayList<>();
        for (int i = 0; i < triangle.size() - 2; i++) {
            for (int j = i + 1; j < triangle.size() - 1; j++) {
                for (int k = j + 1; k < triangle.size(); k++) {
                    if (triangle.get(i) + triangle.get(j) > triangle.get(k) && triangle.get(i) + triangle.get(k) > triangle.get(j)
                            && triangle.get(j) + triangle.get(k) > triangle.get(i)) {
                        maxTriangle.add(triangle.get(i));
                        maxTriangle.add(triangle.get(j));
                        maxTriangle.add(triangle.get(k));
                        break;
                    }
                }
                if (maxTriangle.size() > 0) {
                    break;
                }
            }
            if (maxTriangle.size() > 0) {
                break;
            }
        }
        maxTriangle.sort(Comparator.naturalOrder());
        return maxTriangle;
    }
}

