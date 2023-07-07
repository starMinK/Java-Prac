package chapter3.ch02;

public class VipCustomer extends Customer{

    String agentID;
    double saleRatio;

    public VipCustomer() {
        bonusRatio = 0.05;
        saleRatio = 0.01;
        customerGrade = "VIP";
    }

}
