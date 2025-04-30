import java.util.Arrays;

public class Q7 {

    public static void linear(int [] arr){
        int n = arr.length;
//        int arr[] = {18,0,1,2,3,-5};

        for(int i =0; i < n; i++){
            System.out.println("i " + i);
            if (arr[i] > 0 && arr[i] <= n && arr[arr[i]-1] != arr[i]){
                int temp = arr[i];
                System.out.println(arr[arr[i]-1] + " " + temp + " " + arr[temp-1]  + " " + (arr[i]-1) ) ;
                arr[i] = arr[temp-1];
                arr[temp -1] = temp;
                System.out.println(Arrays.toString(arr));

            }
        }
//        Arrays.stream(arr).sorted();

        for (int i = 0; i < n; i++) {

            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(n + 1);


    }

    public static void binary(int[]arr,int target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = (left + right)/ 2;
            if(arr[mid] == target){
                System.out.println("FOUND");
                return;
            }else if(target > arr[mid]){
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        System.out.println("Not Found");
    }

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

        int arr[] = {18,0,1,2,3,-5};
        int target = 0;
        linear(arr);
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        binary(arr,target);

    }
}
