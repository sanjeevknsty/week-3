import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,6,3,7,8,9,10};
        HashMap<Integer, ArrayList<Integer>> unsorted = new HashMap<>();
        int i = 0;
        int j = 1;
        while(j < arr.length-1){
//            System.out.println("j" + j + " " + i);
            while(arr[j] - arr[j-1] == 1  ){
                j++;
                if(j > arr.length-1){
                    break;
                }
            }
            if(arr[i+1] - arr[i] == 1){
                unsorted.put(i, new ArrayList<>());
                for(int k = i ; k<j ; k++){
                    unsorted.get(i).add(arr[k]);
                }
            }
            System.out.println(i + " " + j);
            i =j;
            j++;

        }
        System.out.println(unsorted);
    }

}

