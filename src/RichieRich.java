import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfDigits = in.nextInt();
        int maxAlterations = in.nextInt();
        String number = in.next();
        char maxDigit = '9';
        StringBuilder sb = new StringBuilder(number);
        int alterations = 0;

        for (;;) {
            if (maxAlterations >= numberOfDigits) {
                if (numberOfDigits == 1) {
                    char max = '9';
                    sb.setCharAt(0, max);
                    break;
                }
                else {
                    for (int i = 0; i < sb.length(); i++) {
                        if (sb.charAt(i) != maxDigit) {
                            sb.setCharAt(i, maxDigit);
                            alterations++;
                        }
                    }
                }
                break;
            }
             else {
                for (int i = 0; i < numberOfDigits / 2; i++) {
                    if (sb.charAt(i) != sb.charAt(number.length() - i - 1)) {
                        if (sb.charAt(i) == maxDigit) {
                            sb.setCharAt(number.length() - i - 1, maxDigit);
                            alterations++;
                        }
                        else if (sb.charAt(number.length() - i - 1) == maxDigit) {
                            sb.setCharAt(i, maxDigit);
                            alterations++;
                        }
                        else {
                            sb.setCharAt(i, maxDigit);
                            sb.setCharAt(number.length() - i - 1, maxDigit);
                            alterations += 2;
                        }
                    }
                    else if (alterations + 2 <= maxAlterations && sb.charAt(i) == sb.charAt(number.length() - i - 1)
                            && sb.charAt(i) != maxDigit && sb.charAt(number.length() - i - 1) != maxDigit) {
                        sb.setCharAt(i, maxDigit);
                        sb.setCharAt(number.length() - i - 1, maxDigit);
                        alterations += 2;
                    }
                }
                break;
            }
        }
        if (maxAlterations - 1 >= alterations) {
            if (numberOfDigits % 2 != 0) {
                sb.setCharAt(numberOfDigits / 2,maxDigit);
                System.out.println(sb);
            }
            else {
                System.out.println(sb);
            }
        }
        else if (alterations <= maxAlterations) {
            System.out.println(sb);
        }
        else {
            System.out.println("-1");
        }
    }
}