import java.util.Stack;

class ValidParanthesisString {
    public static boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stk = new Stack<>();
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
            } else if (arr[i] == '*') {
                stk.push(i);
            } else if (!stack.isEmpty()) {
                stack.pop();
            } else if (!stk.isEmpty()) {
                stk.pop();
            } else {
                return false;
            }
        }
        while (!stack.isEmpty() && !stk.isEmpty() && stack.peek() < stk.peek()) {
            stack.pop();
            stk.pop();
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "((*))";
        System.out.println(checkValidString(s));
    }
}