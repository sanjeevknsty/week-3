import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] arr, int low, int mid ,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left  = low;
        int right = mid + 1;
        System.out.println("************************");
        System.out.println("Entered " + low + " mid-> " + mid + " " +right + " " +  high);
//        5 4 3 2 1
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                System.out.println("Main Innner IF--> " + arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                System.out.println("Main Innner Else--> " + arr[right]);
                right++;
            }
        }

        while (left <= mid){
            temp.add(arr[left]);
            System.out.println("outer FIRST--> " + arr[left]);
            left++;
        }

        while ((right <= high)){
            temp.add(arr[right]);
            System.out.println("outer SECOND--> " + arr[right]);

            right++;
        }
        System.out.println(low + " " + (high));
        for(int i =low ; i<= high ;i++){
            arr[i] = temp.get(i-low);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void ms(int[] arr , int left, int right){
        if(left == right){
            return;
        }
        int mid = (left + right) /2 ;
        System.out.println("MIDDLE ELEMENT --------- " + mid + " " + left + " " + right);
        ms(arr,left,mid);
        ms(arr,mid+1,right);
        mergeSort(arr,left,mid,right);
    }
    public static void main(String args[]){
        int [] arr = {5,4,3,2,1};
        ms(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
