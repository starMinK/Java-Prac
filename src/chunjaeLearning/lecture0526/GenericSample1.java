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
        try {
            for (T arg : args) {
                i[index++] = arg;
            }
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    public void addData() {
        try {
            for (T arg : i) {
                if (arg instanceof Integer) {
                    sum += (int) arg;
                } else if (arg instanceof Double) {
                    sum += (double) arg;
                }
            }
            System.out.println(sum);
            System.out.println(sum / i.length);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }

    public void printData() {
        try {
            for (T t : i) {
                System.out.print(t + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다: " + e.getMessage());
        }
    }
}
