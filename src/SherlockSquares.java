    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.Scanner;

    public class SherlockSquares {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            int maxSquare = 32000;
            ArrayList<Integer> results = new ArrayList<>();

            for (int i = 0; i < testCases; i++) {
                int fromThis = in.nextInt();
                int toThis = in.nextInt();
                int numSquares = (int) (Math.floor(Math.sqrt(toThis)) - Math.ceil(Math.sqrt(fromThis)) + 1);
                results.add(numSquares);
            }

            for (int i = 0; i < results.size(); i++) {
                int result = results.get(i);
                System.out.println(result);
            }
        }
    }
