import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] ar = new int[count];
        for (int i = 0; i < count; i++)
        {
            ar[i] = in.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < ar.length; i++)
        {
            sum += ar[i];
        }
        System.out.println(sum);
    }
}
