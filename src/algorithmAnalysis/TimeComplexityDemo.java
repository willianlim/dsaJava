package algorithmAnalysis;

/**
 * Exemplifying the complexity of algorithm.
 */
public class TimeComplexityDemo {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();

        System.out.println(demo.findSum1(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milliseconds.");
        System.out.println();

        now = System.currentTimeMillis();
        System.out.println(demo.findSum2(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " milliseconds.");
    }

    /**
     * Performs the sum of 'n' numeric elements of type int and returns the
     * result in a performative way
     *
     * @param n Number of elements to be added sequentially
     * @return The sum of the elements
     */
    public int findSum1(int n) {
        return (n * (n + 1) / 2);
    }

    /**
     * Performs the sum of 'n' numeric elements of type int and returns the
     * result in a not performative way
     *
     * @param n Number of elements to be added sequentially
     * @return The sum of the elements
     */
    public int findSum2(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return (sum);
    }
}
