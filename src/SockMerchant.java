import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numberOfSocks = in.nextInt();
        int[] pile = new int[numberOfSocks];
        boolean[] used = new boolean[numberOfSocks];
        int pairs = 0;
        for (int i = 0; i < pile.length; i++) {
            pile[i] = in.nextInt();
        }

        for (int i = 0; i < pile.length; i++) {
            if (used[i] == true)
            {
                continue;
            }
            for (int j = i + 1; j <= pile.length - 1; j++) {
                if (pile[i] == pile[j] && used[j] == false){
                    pairs++;
                    used[j] = true;
                    break;
                }
            }
        }
        System.out.println(pairs);
    }
}
