package lecture0526;

import lecture0522.Printf;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterTest1 {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        list.add("lee");
        list.clear();
        list.add("cho");
        list.add("kim");
        list.add("chung");
        list.add("min");
        list.add("chung");
        System.out.println(list.size());
        System.out.println(list.contains("chung"));

        list.remove("kim");
        System.out.println(list.size());

        print(list);
        print(list.toArray());
    }
    public static void print(Set<String> set) {
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = (String) iter.next();
            System.out.println(str);
        }
    }
    public static void print(Object[] obj){
        int count = obj.length;
        for (int i = 0; i < count; i++) {
            System.out.println(obj[i]);
        }
    }
}
