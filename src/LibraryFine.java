import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int returnDay = in.nextInt();
        int returnMonth = in.nextInt();
        int returnYear = in.nextInt();
        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();

        int fine = 0;

        if (returnYear == expectedYear && returnMonth == expectedMonth && returnDay < expectedDay) {
            fine = 0;
        }
        else if (returnYear == expectedYear && returnMonth == expectedMonth && returnDay != expectedDay) {
            fine = (returnDay - expectedDay) * 15;
        }
        else if (returnMonth > expectedMonth && expectedYear == returnYear) {
            fine = (returnMonth - expectedMonth) * 500;
        }
        else if (returnYear > expectedYear) {
            fine = 10000;
        }
        System.out.println(fine);
    }
}
