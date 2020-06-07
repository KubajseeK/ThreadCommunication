package sk.itsovy.kutka;

public class Main {

    public static void main(String[] args) {
        QuickMaths quickMaths = new QuickMaths();
        new Thread(() -> quickMaths.addAmount(5)).start();
        new Thread(() -> quickMaths.multiplyAmount(5)).start();
    }
}
