package lecture0526;

public class SeaAirplaneUtil {
    public static void show(Plane2 p) {
        System.out.println(p.power());

        p.fly();
    }

    public static void show(Ship2 ship2) {
        System.out.print(ship2.move() + "명을 태우고 ");
        System.out.println(ship2.carry() + "kg을 싣고 가고있다.");
    }

    public static void show(SeaAirplane s) {
        System.out.println(s);
    }

    public static void showOnly(Ship2 s) {
        System.out.print(s.move() + "명을 태우고 ");
        System.out.println(s.carry() + "kg을 싣고 가고있다.");
    }

    public static void showPlane(Plane2 p) {
        System.out.println(p.power());
        p.fly();
    }
}
