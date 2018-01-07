import java.util.Scanner;

public class BtwTwoSets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int firstSetCount = in.nextInt();
        int secondSetCount = in.nextInt();
        
        int[] firstSet = new int[firstSetCount];
        for (int i = 0; i < firstSet.length; i++) {
            firstSet[i] = in.nextInt();
        }

        int[] secondSet = new int[secondSetCount];
        for (int i = 0; i < secondSet.length; i++) {
            secondSet[i] = in.nextInt();
        }

        int maxElem = 0;
        int firstSetMax = max(firstSet);
        int secondSetMax = max(secondSet);

        if (firstSetMax > secondSetMax)
        {
            maxElem = firstSetMax;
        }
        else
        {
            maxElem = secondSetMax;
        }

        int inBetween = 0;
        for (int i = 1; i <= maxElem; i++) {
            int count = 0;
            for (int j = 0; j < firstSet.length; j++) {
                int counter = 0;
                if (i % firstSet[j] == 0)
                {
                    count++;
                }
                else {
                    break;
                }
                if (count == firstSetCount)
                {
                    for (int k = 0; k < secondSet.length; k++) {
                        if (secondSet[k] % i == 0)
                        {
                            counter++;
                        }
                        else {
                            break;
                        }
                        if (counter == secondSet.length)
                        {
                            inBetween++;
                        }
                    }
                }

            }
        }

        System.out.println(inBetween);
    }
    static int max(int[] set)
    {
        int max = 0;
        for (int i = 0; i < set.length; i++)
        {
            int tempMax = set[i];
            if (tempMax > max){
                max = tempMax;
            }
        }
        return max;
    }
}
