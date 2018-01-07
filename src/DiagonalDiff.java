import java.util.Scanner;

public class DiagonalDiff {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[][] matrix = new int[count][count];

        for (int i = 0; i < count ; i++) {
            for (int j = 0; j < count; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int result = 0;
        int firstDiag = 0;
        int secondDiag =0;
        int j = count - 1;

        for (int i = 0; i < count ; i++) {
            firstDiag += matrix[i][i];
            secondDiag += matrix[i][j];
            j--;
        }

        result = firstDiag - secondDiag;
        System.out.println(Math.abs(result));
    }
}
