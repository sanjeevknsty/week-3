import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {345, 46, 2, 45, 32, 3, 4};
        int n = arr.length;
        int size = 3;

        int [] result = new int[n-size+1];
//        int max = 0;
        Deque<Integer> deque = new LinkedList<>();

        int i = 0;
        while ( i < n) {
            if (!deque.isEmpty() && deque.peek() <= i - size ) {
                System.out.println("First " + deque);
                System.out.println(deque.poll());
            }
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                System.out.println("second" + deque +" LKAST " + deque.peekLast() + "--i-- " + i);
                System.out.println(deque.pollLast());
            }
            deque.offer(i);
            System.out.println("i " + i);
            if (i >= size-1 ) {
                System.out.println("Entered " + i + " " + (size-1));

                result[i - size + 1] = arr[deque.peek()];
                System.out.println("RES " +Arrays.toString(result) );
            }
             i++;

        }
        System.out.println(Arrays.toString(result));
//    int i = 0;
//    int j = 1;
//int size = 3;

//          while (j < n) {
//
//        int max = Math.max(arr[i], arr[i + 1]);
//        System.out.println(i + " " + (i + 1));
////            j=1;
//        System.out.println("J ---->" + j);
//        while (j - i + 1 <= size) {
//            max = Math.max(max, arr[j]);
//            j++;
//            deque.offer(j);
//        }
//
//        System.out.println(max);
//        i++;
//    }
    }
}
