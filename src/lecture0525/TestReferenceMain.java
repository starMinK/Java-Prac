package lecture0525;

public class TestReferenceMain {
    public static void main(String[] args) {
        TestReference hong = new TestReference();
        hong.setName("홍길동");
        hong.setTelephone("1234-1234");
        hong.setAge(24);

        System.out.println(hong.getName());
        System.out.println(hong.getTelephone());
        System.out.println(hong.getAge());
    }
}
