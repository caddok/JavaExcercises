import java.util.ArrayList;
import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        ArrayList<String> classStart = new ArrayList<>();

        for (int i = 0; i < testCases; i++) {
            int maxStudents = in.nextInt();
            int requiredStudents = in.nextInt();
            int[] arivalTimes = new int[maxStudents];
            int studentsOnTime = 0;
            for (int j = 0; j < arivalTimes.length; j++) {
                arivalTimes[i] = in.nextInt();
                if (arivalTimes[i] <= 0 ) {
                    studentsOnTime++;
                }
            }
            if (studentsOnTime >= requiredStudents) {
                classStart.add("NO");
            }
            else {
                classStart.add("YES");
            }
        }

        for (int i = 0; i < classStart.size(); i++) {
            String answer = classStart.get(i);
            System.out.println(answer);
        }
    }
}
