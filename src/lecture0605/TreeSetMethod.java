package lecture0605;

import java.util.*;

public class TreeSetMethod {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 50; i > 0; i -= 2) {
            treeSet.add(i);
        }

        System.out.println(treeSet.toString());
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.lower(26));
        System.out.println(treeSet.higher(26));
        System.out.println(treeSet.floor(25));
        System.out.println(treeSet.floor(26));
        System.out.println(treeSet.ceiling(25));
        System.out.println(treeSet.ceiling(26));
        System.out.println();

        int treeSetSize = treeSet.size();
        System.out.println(treeSet);
        for (int i = 0; i < treeSetSize; i++) {
            System.out.println(treeSet.pollFirst() + " ");
        }
        System.out.println();
        System.out.println(treeSet.size());

        for (int i = 50; i > 0; i -= 2) {
            treeSet.add(i);
        }
        SortedSet<Integer> sSet = treeSet.headSet(20);
        System.out.println(sSet.toString());

        NavigableSet<Integer> nSet = treeSet.headSet(20, true);
        System.out.println(nSet.toString());
        nSet = treeSet.headSet(20, false);
        System.out.println(treeSet.toString());

        sSet = treeSet.tailSet(20);
        System.out.println(sSet.toString());

        nSet = treeSet.tailSet(20, true);
        System.out.println(nSet.toString());

        nSet = treeSet.tailSet(20, false);
        System.out.println(nSet.toString());

        sSet = treeSet.subSet(10, 20);
        System.out.println(sSet.toString());

        nSet = treeSet.subSet(10, true, 20, false);
        System.out.println(nSet.toString());

        nSet = treeSet.subSet(10, false, 20, true);
        System.out.println(nSet.toString());

        System.out.println(treeSet);
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println(descendingSet);
        descendingSet = descendingSet.descendingSet();
        System.out.println(descendingSet);
    }
}
