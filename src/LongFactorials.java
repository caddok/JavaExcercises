import java.math.BigInteger;
import java.util.Scanner;

public class LongFactorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int factorial = in.nextInt();
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= factorial; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
