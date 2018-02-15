import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CrookedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String crookedNumber = in.next();
        int crookedSum = 0;
        StringBuilder sb = new StringBuilder(crookedNumber);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i)) == false) {
                continue;
            }
            int number = sb.charAt(i) - '0';
            crookedSum += number;
            if (i == sb.length() - 1) {
                if (crookedSum > 10) {
                    sb.delete(0,sb.length());
                    sb.append(crookedSum);
                    i = -1;
                    crookedSum = 0;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(crookedSum);



    }
}
