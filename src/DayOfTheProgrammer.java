import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int julianCalendarStart = 1700;
        int transitionYear = 1918;
        int gregorianCalendarStart = 1919;
        int endYear = 2700;

        if (year >= gregorianCalendarStart && year <= endYear){
            if (year % 400 == 0 || year % 4 == 0 && year % 100 !=0)
            {
                System.out.println("12.09."+ year);
            }
            else {
                System.out.println("13.09."+ year);
            }
        }
        else if (year >= julianCalendarStart && year < transitionYear){
            if (year % 4 == 0){
                System.out.println("12.09."+ year);
            }
            else {
                System.out.println("13.09."+ year);
            }
        }
        else if (year == transitionYear){
            System.out.println("26.09." + year);
        }
    }
}
