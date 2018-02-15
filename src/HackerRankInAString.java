import jdk.nashorn.internal.runtime.regexp.joni.Regex;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class HackerRankInAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        for (int i = 0; i < testCases; i++) {
            String input = in.next();
            Pattern h = Pattern.compile("h");
            Pattern a = Pattern.compile("a");
            Pattern c = Pattern.compile("c");
            Pattern k = Pattern.compile("k");
            Pattern e = Pattern.compile("e");
            Pattern r = Pattern.compile("r");
            Pattern r2 = Pattern.compile("r");
            Pattern a2 = Pattern.compile("a");
            Pattern n = Pattern.compile("n");
            Pattern k2 = Pattern.compile("k");

            Matcher mH = h.matcher(input);
            Matcher mA = a.matcher(input);
            Matcher mC = c.matcher(input);
            Matcher mK = k.matcher(input);
            Matcher mE = e.matcher(input);
            Matcher mR = r.matcher(input);
            Matcher mR2 = r2.matcher(input);
            Matcher mA2 = a2.matcher(input);
            Matcher mN = n.matcher(input);
            Matcher mk2 = k2.matcher(input);
            if (mH.find() && mA.find() && mC.find() && mK.find() && mE.find() && mR.find() && mR2.find() &&
                    mA2.find() && mN.find() && mk2.find()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
