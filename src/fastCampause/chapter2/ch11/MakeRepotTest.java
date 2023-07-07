package chapter2.ch11;

public class MakeRepotTest {
    public static void main(String[] args) {
        MakeReport builder = new MakeReport();
        String report = builder.getReport();

        System.out.println(report);
    }
}
