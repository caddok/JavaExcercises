import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalPages = in.nextInt();
        int requiredPage = in.nextInt();

        int middlePage = totalPages / 2;
        int pagesTurned;

        if (totalPages % 2 == 0) {
            if (requiredPage <= middlePage)
            {
                pagesTurned = requiredPage / 2;
            }
            else if (totalPages == requiredPage || requiredPage == 1) {
                pagesTurned = 0;
            }
            else if (totalPages - requiredPage == 1) {
                pagesTurned = 1;
            }
            else {
                pagesTurned = ((totalPages - requiredPage) / 2);
            }
        }
        else {
            if (requiredPage <= middlePage) {
                pagesTurned = requiredPage / 2;
            }
            else if (totalPages == requiredPage || requiredPage == 1 || totalPages - requiredPage == 1) {
                pagesTurned = 0;
            }
            else {
                pagesTurned = ((totalPages - requiredPage) / 2);
            }
        }
        System.out.println(pagesTurned);
    }
}
