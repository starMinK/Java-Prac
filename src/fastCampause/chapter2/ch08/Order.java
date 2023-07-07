package chapter2.ch08;

public class Order {
    int orderNum;
    int orderPhoneNum;
    String orderAddress;
    int orderDate;
    int orderTime;
    int orderPrice;
    int menuNum;

    public Order() {

    }

    public Order(int orderNum, int orderPhoneNum, String orderAddress, int orderDate,
                 int orderTime, int orderPrice, int munuNum) {
        this.orderNum = orderNum;
        this.orderPhoneNum = orderPhoneNum;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNum = munuNum;
    }

    public String orderInfo() {
        return "주문 접수 번호 : " + orderNum + "\n"
                + "주문 핸드폰 번호 : " + orderPhoneNum + "\n"
                + "주문 집 주소 : " + orderAddress + "\n"
                + "주문 날짜 : " + orderDate + "\n"
                + "주문 시간 : " + orderTime + "\n"
                + "주문 가격 : " + orderPrice + "\n"
                + "메뉴 번호 : " + menuNum;
    }
}
