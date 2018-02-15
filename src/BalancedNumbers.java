import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int balancedSum = 0;
        boolean isBalanced = true;
        while (isBalanced) {
            int balancedNumber = in.nextInt();
            int first = 0;
            int second = 0;
            int third = 0;
            int numberToBalance = balancedNumber;
            int numberOfDigits = 3;
            while (numberToBalance > 0) {
                int digit = numberToBalance % 10;
                if (numberOfDigits == 3) {
                    third = digit;
                }
                else if (numberOfDigits == 2) {
                    second = digit;
                }
                else {
                    first = digit;
                }
                numberOfDigits--;
                numberToBalance /= 10;
            }
            if (first + third == second) {
                balancedSum += balancedNumber;
            }
            else {
                isBalanced = false;
                break;
            }
        }
        System.out.println(balancedSum);
    }
}
