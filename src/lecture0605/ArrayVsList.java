package lecture0605;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c", "d", "e"};
        System.out.println(array.length);
        array[2] = null;
        array[3] = null;
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        System.out.println();

        List<String> aList = new ArrayList<String>();
        System.out.println(aList.size());
        aList.add("a");
        aList.add("b");
        aList.add("c");
        aList.add("d");
        aList.add("e");
        System.out.println(aList.size());
        aList.add("f");
        aList.add("g");
        System.out.println(aList.size());
        System.out.println(aList);
    }
}
