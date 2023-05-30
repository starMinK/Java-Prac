package lecture0530;

class Aa {
    Aa() {
        System.out.println("1'st constructor");
    }

    Aa(int a) {
        System.out.println("2'nd constructor");
    }

    Aa(int a, int b) {
        System.out.println("3'rd constructor");
    }
}
public class ConstructerOverloading {
    public static void main(String[] args) {
        Aa a1 = new Aa();
        Aa a2 = new Aa(3);
        Aa a3 = new Aa(3, 4);
    }
}
