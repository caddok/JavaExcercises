import java.util.Scanner;

public class SherlockAndTheBeast {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            int number = in.nextInt();
            StringBuilder sb = beastNumber(number);
            System.out.println(sb);
        }

    }
    public static StringBuilder beastNumber(int number) {
        StringBuilder sb = new StringBuilder();
        int maxDigits = number;
        while (number > 0) {
            sb.append(5);
            number--;
            if (sb.length() % 3 == 0 && number % 5 == 0) {
                if (number - 5 > 10) {
                    continue;
                }
                else{
                    break;
                }
            }
        }
        if (number % 3 == 0 && number != 0) {
            for (int i = 0; i < number; i++) {
                sb.append(5);
            }
        }
        else if (number % 5 == 0 && number != 0) {
            for (int i = 0; i < number; i++) {
                sb.append(3);
            }
        }
        else if (sb.length() % 3 != 0) {
            if (sb.length() % 5 == 0) {
                sb.delete(0,maxDigits);
                for (int i = 0; i < maxDigits; i++) {
                    sb.append(3);
                }
            }
            else {
                sb.delete(0,maxDigits);
                sb.append(-1);
            }
        }
        return sb;
    }
}
