import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        String finalString = in.next();
        int maxOperations = in.nextInt();

        int sameChars = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (i >= finalString.length()) {
                break;
            }
            if (i < finalString.length() && inputString.charAt(i) != finalString.charAt(i)) {
                break;
            }
            else if (inputString.charAt(i) == finalString.charAt(i)){
                sameChars++;
            }
        }
        int deleteOperations = 0;
        int insertOperations = 0;
        int operationsLeft = 0;

        if (finalString.length() > inputString.length()) {
            insertOperations = finalString.length() - sameChars;
            operationsLeft = maxOperations - insertOperations;
        }
        else if (inputString.length() > finalString.length()) {
            deleteOperations = inputString.length() - sameChars;
            operationsLeft = maxOperations - deleteOperations;
        }
        else {
            if (sameChars == 0) {
                deleteOperations = inputString.length();
                insertOperations = finalString.length();
                operationsLeft = maxOperations - deleteOperations;
            }
            else {
                deleteOperations = insertOperations = sameChars;
            }
        }
        int operationsPerformed = deleteOperations + insertOperations;

        if (operationsPerformed == maxOperations) {
            System.out.println("Yes");
        }
        else if (inputString.equals(finalString)) {
            System.out.println("Yes");
        }
        else if (operationsLeft > finalString.length()) {
            System.out.println("Yes");
        }
        else if (operationsPerformed > maxOperations) {
            System.out.println("No");
        }
        else if ((maxOperations - operationsPerformed) % 2 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
