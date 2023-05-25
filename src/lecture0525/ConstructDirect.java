package lecture0525;

public class ConstructDirect {
    private String name;
    private String address;
    private int age;

    public ConstructDirect(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setList(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getList() {
        String str = name + " " + address + " " + age;
        return str;
    }
    public static void main(String[] args) {
        ConstructDirect ct = new ConstructDirect("홍길동", "서울시 중구", 25);
        String s;
        s = ct.getList();
        System.out.println(s);
    }
}
