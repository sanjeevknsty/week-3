//Quick sort
import java.util.Scanner;
public class Q4{
    public static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivot=partition( arr,low,high);
            quicksort(arr, low, pivot-1);
            quicksort(arr, pivot+1, high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int [] arr = {199,99,54,12,43};

        quicksort(arr, 0, arr.length-1);
        System.out.println("Sorted :");
        for (int price : arr) {
            System.out.print(price + " ");
        }
    }
}