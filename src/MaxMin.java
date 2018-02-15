import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        int balancedNumbers = in.nextInt();
        for (int i = 0; i < count; i++) {
            numbers.add(in.nextInt());
        }
        numbers.sort(Comparator.naturalOrder());
        ArrayList<Integer> unfairness = getUnfairnessFactors(numbers,balancedNumbers);
        System.out.println(Collections.min(unfairness));
    }
    public static ArrayList<Integer> getUnfairnessFactors(ArrayList<Integer> numbers, int balance) {
        ArrayList<Integer> unfair = new ArrayList<>();
        List<Integer> temp;
        for (int i = 0; i <= numbers.size() - balance; i++) {
            int minDiff = numbers.get((i + balance) - 1) - numbers.get(i);
            unfair.add(minDiff);
        }
        return  unfair;
    }
}
