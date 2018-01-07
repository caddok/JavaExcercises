import java.util.Scanner;

public class DivisableSumPairs {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int divider = in.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        int sum = 0;
        int pairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (i < j){
                    sum += (numbers[i] + numbers[j]);
                }
                if (sum % divider == 0 && sum != 0){
                    pairs++;
                    sum = 0;
                }
                else {
                    sum = 0;
                }
            }
        }
        System.out.println(pairs);
    }
}
