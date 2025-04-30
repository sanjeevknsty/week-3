import java.util.Arrays;

public class Quick {

    //    public static int[] swap(int[] arr, int i, int j) {
    //        int temp = arr[i];
    //        arr[i] = arr[j];
    //        arr[j] = temp;
    //        return arr;
    //   }
    public static int partition(int[] arr,int low, int high){
        int pivot = arr[low];
        int i = low+1;
        int j = high;
        while (i<=j){
            if(pivot < arr[i] && pivot > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(pivot > arr[i]){
                i++;
            }else {
                j--;
            }
        }



        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
    public static void quickSort(int[] arr, int low ,int high){
        if(low < high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {14,10,5,12,45,7,87,54};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
