import java.util.LinkedList;
import java.util.Queue;

public class Q5 {
    public static void main(String[] args) {
        int [] petrol = {4,6,7,8};
        int[] distance = {5,7,8,3};
        int start = 0;
        int sur_total = 0;
        int surplus = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i =0 ; i< petrol.length ; i++){
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int i = queue.poll();
            surplus += petrol[i] - distance[i];
            sur_total += petrol[i] - distance[i];

            if(surplus < 0){
                start = i+1;
                surplus = 0;
            }
        }

        if(sur_total < 0){
            System.out.println("Cannot Go");
        }else {
            System.out.println(start);
        }
    }
}