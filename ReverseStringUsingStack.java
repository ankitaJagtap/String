import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Stack stack = new Stack<String>();
        Stack stack1 = new Stack<String>();
        String str = "Ankita";
        stack.push(str);
        while (stack.empty()) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1);

    }

}
