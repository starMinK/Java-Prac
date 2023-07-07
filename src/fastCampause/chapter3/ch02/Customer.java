package chapter3.ch02;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;



    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        if (customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio;
        } else if (customerGrade == "VIP") {

        }

        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }
}
