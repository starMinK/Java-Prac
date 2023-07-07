package lecture0531.pack1;

public class AccessModifierOfMemberB {
    public void print() {
        AccessModifierOfMemberA a = new AccessModifierOfMemberA();
        System.out.print(a.a + " ");    //a: public
        System.out.print(a.b + " ");    //b: protected
        System.out.print(a.c + " ");    //c: default
//        System.out.print(a.d + " ");  //d: private
        System.out.println();
    }
}
