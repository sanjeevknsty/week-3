public class Q5{
    public static int recursive(int n) {
        if (n <= 1) return n;
        return recursive(n - 1) + recursive(n - 2);
    }
    public static int iterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }


    public static void main(String[] args) {
        int[] sizes = {10, 30, 50,1000};
        for (int n : sizes) {
            System.out.println();
            long startTime = System.nanoTime();
            if (n <= 30) {
                recursive(n);
                long endTime = System.nanoTime();
                System.out.println("Recursive  Time for " + n + ": " + (endTime - startTime) );
            }

            startTime = System.nanoTime();
            iterative(n);
            long endTime = System.nanoTime();
            System.out.println("Iterative  Time for " + n + ": " + (endTime - startTime) );
        }
    }
}
