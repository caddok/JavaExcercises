import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.lang.Object;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeatifulBinaryString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthOfString = in.nextInt();
        String binaryString = in.next();
        Pattern pattern = Pattern.compile("010");
        Matcher m = pattern.matcher(binaryString);
        int corrections = 0;
        while (m.find()) {
            corrections++;
        }
       /* String uglyString = "010";
        System.out.println((lengthOfString - binaryString.replaceAll("010","").length())/3);*/
        System.out.println(corrections);
    }
}
