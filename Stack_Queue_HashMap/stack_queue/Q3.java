
import java.util.Stack;

public class Q3 {
    public static void main(String[] args) {
        int [] stockPriceArr = {100, 80, 60, 70, 60, 75, 85};
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < stockPriceArr.length; i++) {
            while(!stack.isEmpty() && stockPriceArr[i] <= stockPriceArr[stack.peek()]) {
                stack.pop();
            }
            stack.push(i);
        }
        System.out.println(stack);
    }
}
