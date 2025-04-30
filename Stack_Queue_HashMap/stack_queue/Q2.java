import java.util.Stack;

public  class Q2 {
    public static Stack sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()) {
            int top = stack.pop();
            while(!temp.isEmpty() && temp.peek() > top) {
                stack.push(temp.pop());
            }
            temp.push(top);
        }
        System.out.println(temp);
       return temp;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(6);
        stack.push(4);
        Stack<Integer> sorted = sortStack(stack);
        System.out.println(sorted);
    }
}