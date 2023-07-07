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

        System.out.println();

        TestReference kim = new TestReference();
        kim.setName("김규민");
        kim.setTelephone("4321-4231");
        kim.setAge(20);

        System.out.println(kim.getName());
        System.out.println(kim.getTelephone());
        System.out.println(kim.getAge());
    }
}
