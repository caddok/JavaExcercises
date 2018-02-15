import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length(); ) {
            if (i + 1 > sb.length() - 1) {
                break;
            }
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i,i + 2);
                i = 0;
            }
            else {
                i++;
            }
        }


        if (sb.length() > 0) {
            System.out.println(sb);
        }
        else {
            System.out.println("Empty String");
        }
    }
}
