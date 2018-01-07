import java.util.Scanner;

public class BirthdayChocolate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int blocksOfChoko = in.nextInt();
        int[] chokoNumbs = new int[blocksOfChoko];
        for (int i = 0; i < chokoNumbs.length; i++) {
            chokoNumbs[i] = in.nextInt();
        }
        int birthDay = in.nextInt();
        int birthMonth = in.nextInt();

        int blocksCounted = 0;
        int sum = 0;
        int waysToGive = 0;
        if (blocksOfChoko == 1 && chokoNumbs[0] == birthDay)
        {
            waysToGive++;
        }
        for (int i = 0; i < chokoNumbs.length; i++) {
            sum += chokoNumbs[i];
            blocksCounted++;
            for (int j = i+1; j < chokoNumbs.length; j++) {
                sum += chokoNumbs[j];
                blocksCounted++;
                if (blocksCounted == birthMonth && sum == birthDay){
                    waysToGive++;
                    break;
                }
            }
            sum = 0;
            blocksCounted = 0;
        }

        System.out.println(waysToGive);
    }
}
