import java.util.Arrays;
import java.util.Random;

public class Q2 {

    public static int[] Random(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(size);
        return arr;
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    public static void main(String[] args) {
        int[] sizes = {100 ,1000,10000};
        for(int i : sizes){
            System.out.println();
            System.out.println("Time taken for Size " + i );
            int[] arr = Random(i);


            long startTime = System.nanoTime();
            mergeSort(arr);
            long endTime = System.nanoTime();
            System.out.println("Time taken mergeSort : "+(endTime-startTime));

            startTime = System.nanoTime();
            bubbleSort(arr);
            endTime = System.nanoTime();
            System.out.println("Time taken bubbleSort: "+(endTime-startTime));


            startTime = System.nanoTime();
            quickSort(arr,0,arr.length-1);
            endTime = System.nanoTime();
            System.out.println("Time taken quickSort: "+(endTime-startTime));


        }

    }
}
