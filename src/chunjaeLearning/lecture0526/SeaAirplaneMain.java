package lecture0526;

public class SeaAirplaneMain {
    public static void main(String[] args) {
        SeaAirplane sea = new SeaAirplane("CS110");
        Plane2 p = sea;
        Ship2 s = sea;
        SeaAirplaneUtil.show(sea);
        SeaAirplaneUtil.show(p);
        SeaAirplaneUtil.show(s);
        SeaAirplaneUtil.showOnly(sea);
        SeaAirplaneUtil.showPlane(sea);
    }
}

