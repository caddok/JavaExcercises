import java.util.Scanner;

public class MiniMax {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        int max = 0;
        int min = 0;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int tempMax = arr[i];
            int tempMin = arr[i];

            if (tempMax > max)
            {
                max = tempMax;
            }
            if (i == 0)
            {
                min = tempMin;
            }
            else if(tempMin < min) {
                min = tempMin;
            }
        }
        long maxOfFour = sum - min;
        long minOfFour = sum - max;
        System.out.println(minOfFour + " " + maxOfFour);
    }
}
