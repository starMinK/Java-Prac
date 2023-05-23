package lecture0522;

public class IntArray {
    public static void main(String[] args) {
        int[] myintarray = {100, 31, 33, 55, 67};
        for (int i = 0; i < 5; i++) {
            System.out.println(myintarray[i]);
        }

        for (int ele : myintarray) {
            System.out.println(ele);
        }
    }
}
