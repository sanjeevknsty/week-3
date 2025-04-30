
import java.util.*;
public class Q1 {
    private static List<Integer> ArrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};
        Map<Integer, ArrayList<Integer> > sumNfreq= new HashMap<>();
        int cum_sum = 0;

        List<List<Integer>> list = new ArrayList<>();

        for(int i =0 ; i< arr.length ; i++){
                cum_sum += arr[i];
                System.out.println("-->" + cum_sum);

                if(cum_sum == 0){
                    int[] sub = Arrays.copyOfRange(arr, 0, i + 1);
                    list.add(ArrayToList(sub));
                }


//                for (HashMap.Entry<Integer , ArrayList<Integer> > entry : sumNfreq.entrySet()) {
//                    System.out.println(entry.getKey() + " " + entry.getValue() );
//                }

                if(sumNfreq.containsKey(cum_sum)){
                    System.out.println("CUM__SUM " +cum_sum );
                    for (Integer startIdx : sumNfreq.get(cum_sum)) {
                        System.out.println(startIdx + " ---------- " + i);
                        list.add(ArrayToList(Arrays.copyOfRange(arr, startIdx + 1, i + 1)));
                        System.out.println(list);
                    }
                }
                if(!sumNfreq.containsKey(cum_sum)){

                    sumNfreq.put(cum_sum, new ArrayList<>());

                }
                sumNfreq.get(cum_sum).add(i);


        }

    }
}
