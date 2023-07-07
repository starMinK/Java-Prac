package lecture0605;

class A {}
class B extends A{}
class C extends B{}
class D extends C{}

class Good<T> {
    private T t;
    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}

class Test {
    void method1(Good<A> g){}
    void method2(Good<?> g){}
    void method3(Good<? extends B> g){}
    void method4(Good<? super B> g){}
}
public class BoundedTypeOfInputArguments {
    public static void main(String[] args) {
        Test t = new Test();

        t.method1(new Good<A>());
//        t.method1(new Good<B>());
//        t.method1(new Good<C>());
//        t.method1(new Good<D>());

        t.method2(new Good<A>());
        t.method2(new Good<B>());
        t.method2(new Good<C>());
        t.method2(new Good<D>());

//        t.method3(new Good<A>());
        t.method3(new Good<B>());
        t.method3(new Good<C>());
        t.method3(new Good<D>());

        t.method4(new Good<A>());
        t.method4(new Good<B>());
//        t.method4(new Good<C>());
//        t.method4(new Good<D>());
        }
}
