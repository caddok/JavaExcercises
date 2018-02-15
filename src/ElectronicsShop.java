import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int keyboardsCount = in.nextInt();
        int usbCount = in.nextInt();
        ArrayList<Integer> keyboards = new ArrayList<>();
        for (int i = 0; i < keyboardsCount; i++) {
            keyboards.add(in.nextInt());
        }
        keyboards.sort(Comparator.reverseOrder());
        ArrayList<Integer> usb = new ArrayList<>();
        for (int i = 0; i < usbCount; i++) {
            usb.add(in.nextInt());
        }
        usb.sort(Comparator.reverseOrder());

        int moneySpend = 0;
        int moneyReq = 0;
        for (Integer keyboard : keyboards) {
            for (Integer usbBrand : usb) {
                int sumOfItems = keyboard + usbBrand;
                if (sumOfItems <= money && sumOfItems > moneySpend){
                    moneySpend = sumOfItems;
                }
                if (sumOfItems > money ) {
                    moneyReq = sumOfItems;
                }
            }
        }
        if (moneyReq > money && moneySpend == 0){
            System.out.println("-1");
        }
        else {
            System.out.println(moneySpend);
        }

    }
}
