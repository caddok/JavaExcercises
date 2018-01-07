import java.util.Scanner;

public class Candles {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count ; i++) {
            arr[i] = in.nextInt();
        }
        int candleCount = 0;
        int maxHeigth = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxHeigth){
                candleCount = 1;
                maxHeigth = arr[i];
            }
            else if (arr[i] == maxHeigth){
                candleCount++;
            }
        }
        System.out.println(candleCount);
    }
}
