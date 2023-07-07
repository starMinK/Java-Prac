package lecture0526;

public class SeaAirplaneUtil {
    public static void show(Plane2 p) {
        try {
            System.out.println(p.power());
            p.fly();
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    public static void show(Ship2 ship2) {
        try {
            System.out.print(ship2.move() + "명을 태우고 ");
            System.out.println(ship2.carry() + "kg을 싣고 가고있다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    public static void show(SeaAirplane s) {
        try {
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    public static void showOnly(Ship2 s) {
        try {
            System.out.print(s.move() + "명을 태우고 ");
            System.out.println(s.carry() + "kg을 싣고 가고있다.");
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    public static void showPlane(Plane2 p) {
        try {
            System.out.println(p.power());
            p.fly();
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}
