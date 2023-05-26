package lecture0526;

public class GenericSample1<T> {
    private T[] i;
    private int sum;
    private int index;
    public GenericSample1(int i) {
        this.i = (T[]) new Object[i];
    }
    //(Type)...args : 매개변수 갯수 상관없이 여러개 입력할 수 있다는 연산자
    public void Data(T...args) {
        for (T arg : args) {
            i[index++] = arg;
        }
    }
    public void addData() {
        for (T arg : i) {
            if (arg instanceof Integer) {
                sum += (int) arg;
            } else if (arg instanceof Double) {
                sum += (double) arg;
            }
        }
        System.out.println(sum);
        System.out.println(sum/i.length);
    }
    public void printData() {
        for (T t : i) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
