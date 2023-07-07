//package lecture0526;
//
//class Aaa {
//   int num = 2500;
//class Bbb extends Aaa {
//    int num = 500;
//    public void number2() {
//        int sum = 0, i = 100, j = 200;
//        sum = i + j;
//        System.out.println("Aaa number: " + super.num);
//        System.out.println("Bbb number: " + sum);
//        System.out.println("Bbb number: " + this.num);
//    }
//}
//class Ccc extends Bbb {
//    int num = 3000;
//    public void number1() {
//        int sum = 0, i = 300, j = 400;
//        sum = i + j;
//        System.out.println("Bbb number: " + super.num);
//        System.out.println("Ccc number: " + sum);
//        System.out.println("Ccc number: " + num);
//    }
//}
//
//public class SuperThis {
//    public static void main(String[] args) {
//        Ccc c = new Ccc();
//        c.number1();
//        System.out.println();
//        c.number2();
//    }
//}
