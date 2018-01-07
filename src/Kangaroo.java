import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int kangaroo1 = in.nextInt();
        int kangaroo1Speed = in.nextInt();
        int kangaroo2 = in.nextInt();
        int kangaroo2Speed = in.nextInt();

        int kangaroo1Loc = kangaroo1;
        int kangaroo2Loc = kangaroo2;

        for (int i = 0; i < 10000; i++) {
            kangaroo1Loc += kangaroo1Speed;
            kangaroo2Loc += kangaroo2Speed;

            if (kangaroo1Loc == kangaroo2Loc){
                System.out.println("YES");
                break;
            }
        }
        if (kangaroo1Loc != kangaroo2Loc){
            System.out.println("NO");
        }
    }
}
