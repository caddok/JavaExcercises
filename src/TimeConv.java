import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConv
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String time = in.next("hh:mm:ss a");
        SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ss a");
        String newTime = "";
        try {
            newTime = outFormat.format(inFormat.parse(time));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(newTime);
    }
}
