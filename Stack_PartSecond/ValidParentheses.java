import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' || S.charAt(i) == '[' || S.charAt(i) == '{') {
                stack.push(S.charAt(i));
            } 
            else {
                if(stack.isEmpty()) {
                   
                    return false;
                }
                if (S.charAt(i) == ')' && stack.peek() == '(' 
                || S.charAt(i) == '}' && stack.peek() =='{'
                 || S.charAt(i) == ']' && stack.peek() == '[')
                     {
                        stack.pop();
                    }
                else{
                        return false;
                    }

            }

        }
        if (stack.isEmpty())
            return true;
        else
            return false;

    }

    public static void main(String args[]) {
        String S = "[[[({})]]]{}";
        System.out.print(isValid(S));
    }

}
