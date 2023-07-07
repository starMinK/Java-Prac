package lecture0605;

class InheritanceGenericClassParent<T> {
    T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

class InheritanceGenericClassChild1<T> extends InheritanceGenericClassParent {
    
}

class InheritanceGenericClassChild2<T, V> extends InheritanceGenericClassParent {
    V v;

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

public class InheritanceGenericClass {
    public static void main(String[] args) {

        InheritanceGenericClassParent<String> p = new InheritanceGenericClassParent<>();
        p.setT("부모 제네릭 클래스");
        System.out.println(p.getT());

        InheritanceGenericClassChild1<String> c1 = new InheritanceGenericClassChild1<>();
        c1.setT("자식 1 제네릭 클래스");
        System.out.println(c1.getT());

        InheritanceGenericClassChild2<String, Integer> c2 = new InheritanceGenericClassChild2<>();
        c2.setT("자식 2 제네릭 클래스");
        c2.setV(100);
        System.out.println(c2.getT());
        System.out.println(c2.getV());
    }
}
