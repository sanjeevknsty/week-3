import java.util.*;
public class Q6{
    public static void main(String[] args) {
        int[] sizes = {1000, 100000, 1000000};
        for (int n : sizes) {
            System.out.println("   Size : " + n);
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = i;
            }
            long startTime = System.nanoTime();
            array(array, n - 1);
            long endTime = System.nanoTime();
            System.out.println("Array Search: " + (endTime - startTime) / 1000000.0 + " ms");
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                hashSet.add(i);
            }
            startTime = System.nanoTime();
            hashSet.contains(n-1);
            endTime = System.nanoTime();


            System.out.println("HashSet Search: " + (endTime - startTime) / 1000000.0 + " ms");
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                treeSet.add(i);
            }
            startTime = System.nanoTime();
            treeSet.contains(n-1);
            endTime = System.nanoTime();
            System.out.println("TreeSet Search: " + (endTime - startTime) / 1000000.0 + " ms");
            System.out.println();
        }
    }
    public static void array(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return;
            }
        }
    }
}
