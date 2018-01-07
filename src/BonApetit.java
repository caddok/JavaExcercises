import java.util.Scanner;

public class BonApetit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numberOfMeals = in.nextInt();
        int allergyItem = in.nextInt();
        int[] meals = new int[numberOfMeals];
        for (int i = 0; i < meals.length; i++) {
            meals[i] = in.nextInt();
        }
        int charged = in.nextInt();

        int allergyItemPrice = meals[allergyItem];
        int sum = 0;
        for (int i = 0; i < meals.length; i++) {
            sum +=meals[i];
        }
        int returnCash = 0;
        if (charged == (sum - allergyItemPrice) / 2){
            System.out.println("Bon Appetit");
        }
        else {
            returnCash = charged - (sum - allergyItemPrice) / 2;
            System.out.println(returnCash);
        }
    }
}
