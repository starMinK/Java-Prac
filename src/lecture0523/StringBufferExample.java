package lecture0523;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello JAVA");
        StringBuffer str2 = new StringBuffer("안녕 자바");
        System.out.println("버퍼1 내용 ->" + str1);
        System.out.println("버퍼1 크기 ->" + str1.length());
        System.out.println("버퍼1 용량  ->" + str1.capacity());

        System.out.println("버퍼2 내용 ->" + str2);
        System.out.println("버퍼2 크기 ->" + str2.length());
        System.out.println("버퍼2 용량 ->" + str2.capacity());
    }

}
