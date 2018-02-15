import java.util.ArrayList;
import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        ArrayList<Integer> poisoned = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int numberOfPrisoners = in.nextInt();
            int numberOfSweets = in.nextInt();
            int randomPrisonerID = in.nextInt();
            int prisonerInDanger = 0;

            if (numberOfSweets < numberOfPrisoners) {
                prisonerInDanger = (randomPrisonerID + numberOfSweets) - 1;
                poisoned.add(prisonerInDanger);
            }
            else if (numberOfSweets == numberOfPrisoners) {
                prisonerInDanger= randomPrisonerID - 1;
                poisoned.add(prisonerInDanger);
            }
            else {
                prisonerInDanger = ((numberOfSweets - 1) + (randomPrisonerID - 1)) % numberOfPrisoners + 1;
                poisoned.add(prisonerInDanger);
            }
        }

        for (int i = 0; i < poisoned.size(); i++) {
            int poisonID = poisoned.get(i);
            System.out.println(poisonID);
        }
    }
}
