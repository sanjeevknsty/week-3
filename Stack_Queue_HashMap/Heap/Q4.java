import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
class Linkedlist{
    int key;
    int data;
    Linkedlist next;
    public Linkedlist(int key ,int data){
        this.key = key;
        this.data = data;
        this.next = null;
    }
}

class Hashmap{
     Linkedlist[] arr;
     Linkedlist[] headArr;
    ArrayList<ArrayList<Linkedlist>> arrayM ;
    int count = 0;
    public Hashmap(){
        arr = new Linkedlist[10];
        headArr = new Linkedlist[10];
        arrayM = new ArrayList<>();
    }
    public  void put(int key, int value){
        int i = key % 10;
        Linkedlist newNode = new Linkedlist(key,value);
        if(arr[i] == null){
            arr[i] = newNode;
            headArr[i] = newNode;
        }else{
            Linkedlist temp = arr[i];
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;

        }

    }
    public  void get(int key){
        int i = key % 10;
        Linkedlist temp = arr[i];
        while(temp.next != null){
            temp = temp.next;
        }
            System.out.println(temp.key + " : " + temp.data);
    }
    public void delete(int key){
        int i = key % 10;
        Linkedlist temp = arr[i];
        System.out.println(temp);
        Linkedlist prev = null;
        if (temp != null && temp.key == key) {
            arr[i] = temp.next;
            return;
        }
        while(temp != null && temp.key != key){
            prev = temp;
            System.out.println("TEMP " + temp);
            temp= temp.next;

        }
        prev.next = temp.next;


//        if (temp != null) {
//            System.out.println("KEY " + temp.key);
//
//            if (prev == null) {
//                System.out.println("PREV " + prev);
//                System.out.println("TEMP " + temp);
//                System.out.println("HEAD " + headArr[i]);
//                delArr[count++] = headArr[i] ;
//                headArr[i] = temp.next;
//                System.out.println(headArr[i]);
//                arr[i] = temp.next;
//            } else {
//                delArr[count++] = headArr[i].next;
//
//            }
//        }
    }
   public void retrieval(){

       for(int i =0 ; i<arr.length ; i++){
           Linkedlist temp = arr[i];
           while(temp != null){
               System.out.println(temp.key + " : " + temp.data);
               temp = temp.next;
           }

       }

       System.out.println(Arrays.toString(arr));
   }

}
public class Q4 {
    public static void main(String[] args) {

           Hashmap map = new Hashmap();
           map.put(11, 10);
           map.put(21, 12);
           map.put(21, 12);
           map.put(31, 12);
           map.put(56, 15);
           map.get(31);
           map.delete(21);
           map.retrieval();

    }
}
