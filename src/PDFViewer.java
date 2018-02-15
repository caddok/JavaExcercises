import java.util.Scanner;

public class PDFViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] heigthByAlphabet = new int[26];
        for (int i = 0; i < heigthByAlphabet.length; i++) {
            heigthByAlphabet[i] = in.nextInt();
        }
        String word = in.next();

        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            int letterPos = word.charAt(i) - 97;

            int tempMax = heigthByAlphabet[letterPos];
            if (tempMax > maxHeight) {
                maxHeight = tempMax;
            }
        }

        System.out.println(maxHeight*word.length());
    }
}
