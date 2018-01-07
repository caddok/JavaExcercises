import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0)
            {
                positive++;
            }
            else if (arr[i] < 0){
                negative++;
            }
            else {
                zero++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.000000");
        positive /= count;
        negative /= count;
        zero /= count;
        System.out.println(df.format(positive));
        System.out.println(df.format(negative));
        System.out.println(df.format(zero));
    }
}
