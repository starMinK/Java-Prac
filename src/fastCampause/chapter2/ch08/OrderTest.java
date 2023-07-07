package chapter2.ch08;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(20221122, 01011112222, "서울시 강남구 역삼동 111-333", 20221121,
                130258, 25000, 0003);

        System.out.println(order1.orderInfo());
    }
}
