import java.util.ArrayList;
import java.util.HashMap;

public class Q5 {
    public static void main(String[] args) {
        int arr[] = {2,3,6,4,1,6,1,2,3};
        int target = 5;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int i =0 ;
        while(i < arr.length){
//         if(arr[i] + arr[i-1] == target){
//             System.out.println(arr[i-1] + " " + arr[i]);
//         }

         if(map.containsKey(target - arr[i])){
//             System.out.println("---------->" + (target - arr[i]));
             for(Integer idx : map.get(target - arr[i])){
                 System.out.println(idx + " " + i);
             }
         }

         if(!map.containsKey(arr[i])){
             map.put(arr[i], new ArrayList<>());
         }
         map.get(arr[i]).add(i);
            System.out.println(map);
         i++;
        }
        System.out.println(map);
    }
}
