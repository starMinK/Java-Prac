package chapter2.ch10;

public class BirthdatTest {
    public static void main(String[] args) {
        Birthday date = new Birthday();
        date.setYear(2022);
        date.setMonth(12);
        date.setDay(30);

        date.showDate();
    }
}
