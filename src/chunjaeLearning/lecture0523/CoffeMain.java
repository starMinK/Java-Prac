package lecture0523;

public class CoffeMain {
    public static void main(String[] args) {
        int myMoneyA = 800;
        int cupsA = CoffeMain.coffee(myMoneyA);
        CoffeMain.printCoffee(cupsA);

        int myMoneyB = 150;
        int cupsB = coffee(myMoneyB);
        printCoffee(cupsB);
    }

    public static int coffee(int money) {
        int cups = 0;
        if (money > 0) {
            cups = money;
        } else if (money == 0) {
            cups = 0;
        } else {
            cups = -1;
        }
        return cups;
    }
    public static void printCoffee(int cups) {
        if (cups > 0) {
            System.out.println("커피 " + cups + "잔 입니다.");
        } else {
            System.out.println("액수가 모자랍니다.");
        }
    }

}
