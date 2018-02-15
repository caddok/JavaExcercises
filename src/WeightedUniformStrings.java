import java.util.*;

public class WeightedUniformStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String original = in.next();
        int numberOfQueries = in.nextInt();
        Set<Integer> uniformWeight = new HashSet<Integer>();

        for (int i = 0; i < original.length();) {
            int weight = original.charAt(i) - 96;
            uniformWeight.add(weight);
            int sumOfWeight = weight;
            if (i == original.length() - 1) {
                break;
            }
            if (original.charAt(i) == original.charAt(i + 1)) {
                while (original.charAt(i) == original.charAt(i + 1)) {
                    sumOfWeight += weight;
                    uniformWeight.add(sumOfWeight);
                    if(i + 2 > original.length() - 1) {
                        break;
                    }
                    i++;
                }
            }
            i++;
        }


        for (int i = 0; i < numberOfQueries; i++) {
            int query = in.nextInt();
            if (uniformWeight.contains(query)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
