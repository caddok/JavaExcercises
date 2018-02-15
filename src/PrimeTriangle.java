import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = howManyPrimes(number);
        int primeCount = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                primeCount++;
            }
        }
        int index = 1;
        int count = 0;
        while (count != primeCount) {
            if (isPrime[index] == true) {
                sb.append(1);
                System.out.println(sb);
                count++;
                index++;
            }
            else {
                sb.append(0);
                index++;
            }
        }
    }
    public static boolean[] howManyPrimes(int number) {
        boolean[] primes = new boolean[number + 1];
        primes[1] = true;
        for (int i = 2; i <= number; i++) {
            int counter = 0;
            for (int numb = i; numb >= 1; numb--) {
                if (i % numb == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                primes[i] = true;
            }
        }
        return primes;
    }
}
