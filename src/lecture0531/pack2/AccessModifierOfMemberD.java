package lecture0531.pack2;

import lecture0531.pack1.AccessModifierOfMemberA;

public class AccessModifierOfMemberD extends AccessModifierOfMemberA{
    public void print() {
        System.out.print(a + " ");  //a: public
        System.out.print(b + " ");  //b: protected
//        System.out.print(a.c + " ");  //c: default
//        System.out.print(a.d + " ");  //d: private
        System.out.println();
    }
}
