import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q2 {
    public static ArrayList<Integer> toList (int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ; i<arr.length ; i++){
            list.add(arr[i]);
        }
        return list;

    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};

        int target = 4;
        HashMap <Integer,ArrayList<Integer>> visited =  new HashMap<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int curr_sum = 0;
        for(int i =0 ;i<arr.length ; i++){
            curr_sum += arr[i];
            System.out.println("Sum " + curr_sum);

            if(curr_sum == target){
                res.add(toList(Arrays.copyOfRange(arr, 0, i + 1)));
            }

            if(visited.containsKey(curr_sum - target)){
                System.out.println("---------- "+(target - arr[i]));
                System.out.println(visited);
                for(Integer startIdx : visited.get(curr_sum - target)){
                    res.add(toList(Arrays.copyOfRange(arr, startIdx+1, i + 1)));
                }
            }

            if(!visited.containsKey(curr_sum)){
                visited.put(curr_sum, new ArrayList<>());
            }
            visited.get(curr_sum).add(i);

        }
        System.out.println(res);

    }
}
