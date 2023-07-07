package lecture0526;
public class Generic {
    /*private static void printArray(Integer[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }

    private static void printArray(Double[] dblArray) {
        for (int i = 0; i < dblArray.length; i++) {
            System.out.print(dblArray[i] + " ");
        }
        System.out.println();
    }
    private static void printArray(String[] strArray) {
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }*/

    private static void printArray(Object[] objArray) {
        for (Object o : objArray) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        printArray(intArray);

        Double[] dblArray = {10.1, 20.2, 30.3, 40.4, 50.5};
        printArray(dblArray);

        String[] strArray = {"red", "blue", "green", "black", "yellow"};
        printArray(strArray);
    }
}
