import java.util.*;

public class MinAbsDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            input.add(in.nextInt());
        }
        input.sort(Comparator.naturalOrder());
        Set<Integer> results = new HashSet<>();
        for (int i = 1; i < input.size() - 1; i++) {
            results.add(Math.abs(input.get(i) - input.get(i-1)));
            results.add(Math.abs(input.get(i) - input.get(i + 1)));
        }

        System.out.println(Collections.min(results));
    }
}
