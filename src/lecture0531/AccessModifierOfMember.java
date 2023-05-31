package lecture0531;

import lecture0531.pack1.AccessModifierOfMemberA;
import lecture0531.pack1.AccessModifierOfMemberB;
import lecture0531.pack2.AccessModifierOfMemberC;
import lecture0531.pack2.AccessModifierOfMemberD;

public class AccessModifierOfMember {
    public void print() {
        AccessModifierOfMemberA a = new AccessModifierOfMemberA();  //a: public
        AccessModifierOfMemberB b = new AccessModifierOfMemberB();  //b: protected
        AccessModifierOfMemberC c = new AccessModifierOfMemberC();  //c: default
        AccessModifierOfMemberD d = new AccessModifierOfMemberD();  //d: private

        a.print();
        b.print();
        c.print();
        d.print();
    }
}