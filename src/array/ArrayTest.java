package array;

public class ArrayTest {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
        System.out.println();

        int[] result = arrayUtil.removeEven(new int[] {3, 2, 4, 7, 10, 6, 5});
        arrayUtil.printArray(result);
    }

}
