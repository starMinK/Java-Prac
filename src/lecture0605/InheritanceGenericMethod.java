package lecture0605;

class InheritanceGenericMethodParent {
    <T extends Number> void print(T t) {
        System.out.println(t);
    }
}

class InheritanceGenericMethodChild extends InheritanceGenericMethodParent {

}

public class InheritanceGenericMethod {
    public static void main(String[] args) {
        InheritanceGenericMethodParent p = new InheritanceGenericMethodParent();
        p.print(10);

        InheritanceGenericMethodChild c = new InheritanceGenericMethodChild();
        c.print(5.8);
    }
}
