import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int rem = 0;
            int nextMult = 0;
            if (arr[i] >= 38)
            {
                rem = arr[i] % 5;
                nextMult = arr[i] + 5 - rem;
            }
            else {
                System.out.println(arr[i]);
                continue;
            }
            if (nextMult - arr[i] < 3){
                arr[i] = nextMult;
                System.out.println(arr[i]);
            }
            else {
                System.out.println(arr[i]);
            }

        }
    }
}
