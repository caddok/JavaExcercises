import java.util.*;

public class JimAndOrders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfOrders = in.nextInt();
        ArrayList<Integer> orderNr = new ArrayList<>();
        ArrayList<Integer> timeNeeded = new ArrayList<>();
        for (int i = 0; i < numberOfOrders; i++) {
            int firstVal = in.nextInt();
            int secondVal = in.nextInt();
            int priority = firstVal + secondVal;
            orderNr.add(firstVal);
            timeNeeded.add(priority);
        }

        ArrayList<Integer> orderOfCompletion = new ArrayList<>();
        boolean[] ordersCompleted = new boolean[orderNr.size()];
        while (orderOfCompletion.size() != orderNr.size()) {
            int minTime = Integer.MAX_VALUE;
            int orderNumber = 0;
            for (int i = 0; i < timeNeeded.size(); i++) {
                int next = timeNeeded.get(i);
                if (next < minTime && ordersCompleted[i] == false) {
                    orderNumber = i;
                    minTime = next;
                }
                else if (minTime == next) {
                    if (orderNumber > i) {
                        orderNumber = i;
                    }
                }
            }
            ordersCompleted[orderNumber] = true;
            orderOfCompletion.add(orderNumber + 1);
        }

        for (int i = 0; i < orderOfCompletion.size(); i++) {
            if (i == orderOfCompletion.size() - 1) {
                System.out.print(orderOfCompletion.get(i));
            }
            else {
                System.out.print(orderOfCompletion.get(i) + " ");
            }
        }
    }
}