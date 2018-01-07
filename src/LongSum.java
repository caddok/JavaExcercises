import java.util.Scanner;

public class LongSum {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        long[] ar = new long[count];
        for (int i = 0; i < count ; i++) {
            ar[i] = in.nextLong();
        }
        long sum = 0;

        for (int i = 0; i <ar.length ; i++) {
            sum +=ar[i];
        }

        System.out.println(sum);
    }
}
