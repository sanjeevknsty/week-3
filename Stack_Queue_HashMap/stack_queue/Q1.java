import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1 {
    Stack<Character> charEnqueu = new Stack<>();
    Stack<Character> charDequeu = new Stack<>();
    public void Enqueue(Character ele) {
        charEnqueu.push(ele);
    }

    public Character Dequeue() {
        if(charDequeu.isEmpty()) {
            while(!charEnqueu.isEmpty()) {
                charDequeu.push(charEnqueu.pop());
            }
        }
        System.out.println(charDequeu);
        return charDequeu.pop();
    }

    public static void main(String[] args) {

//        Queue<Stack>  queue = new LinkedList<>();

         Q1 queue = new Q1();
        queue.Enqueue('a');
        queue.Enqueue('b');
        queue.Enqueue('c');

        System.out.println(queue.charEnqueu);
        System.out.println(queue.Dequeue());
        queue.Enqueue('d');
//        queue.Dequeue();
            System.out.println("EnQ " +queue.charEnqueu);
        System.out.println(queue.charDequeu);

    }
}
