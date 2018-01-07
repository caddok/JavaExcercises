import java.util.Scanner;

public class Triplets {
    public static void  main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*int allie1 = in.nextInt();
        int allie2 = in.nextInt();
        int allie3 = in.nextInt();
        int bob1 = in.nextInt();
        int bob2 = in.nextInt();
        int bob3 = in.nextInt();
*/
        int[] ar = new int[6];

        for (int i = 0; i < ar.length ; i++) {
            ar[i] = in.nextInt();
        }
        int allieCount = 0;
        int bobCount = 0;

        for (int i = 0; i < 3 ; i++) {
            int nextNum = ar[i+3];
            if (ar[i] == nextNum)
            {
                continue;
            }
            if (ar[i] > nextNum)
            {
                allieCount++;
            }
            else {
                bobCount++;
            }
        }

   /*     if (allie1 > bob1 && allie1 != bob1) {
            allieCount++;
        }else {bobCount++;}
        if (allie2 > bob2 && allie2 != bob2){allieCount++;}
        else {bobCount++;}
        if (allie3 > bob3 && allie3 != bob3){allieCount++;}
        else {bobCount++;}
*/
        System.out.println(allieCount + " " + bobCount);
    }
}
