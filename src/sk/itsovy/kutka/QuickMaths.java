package sk.itsovy.kutka;

import static sk.itsovy.kutka.ThreadColor.ANSI_BLUE;
import static sk.itsovy.kutka.ThreadColor.ANSI_GREEN;

public class QuickMaths {
    int amount = 0;
    synchronized void addAmount(int newAmount) {
        System.out.println(ANSI_GREEN + "Adding");
        amount += newAmount;
        System.out.println("New Amount is: " + amount);
    }
    synchronized void multiplyAmount(int newAmount) {
        System.out.println(ANSI_BLUE + "Multiplying");
        amount *= newAmount;
        System.out.println("New Amount is: " + amount);

    }
}
