package array;

public class ArrayTest {

    public static void main(String[] args) {
        System.out.println("=== 1º ===");
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
        System.out.println();

        System.out.println("=== 2º ===");
        int[] result = arrayUtil.removeEven(new int[] {3, 2, 4, 7, 10, 6, 5});
        arrayUtil.printArray(result);
        System.out.println();

        System.out.println("=== 3º ===");
        int[] numbers = {2, 11, 5, 10, 7, 8};
        arrayUtil.printArray(numbers);
        arrayUtil.reverse(numbers, 0, numbers.length - 1);
        arrayUtil.printArray(numbers);
        System.out.println();

        System.out.println("=== 4º ===");
        int[] arr = {5, 9, 3, 15, 1, 2};
        System.out.println(arrayUtil.findMinimum(arr));
    }

}
