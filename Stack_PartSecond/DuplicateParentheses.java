import java.util.*;

public class DuplicateParentheses {
    public static boolean duplicateDetector(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }
                // opening pair along with it's closong pair will be poped out

                else {
                    stack.pop();
                }

            } else {
                stack.push(ch);
            }

        }

        return false;
    }

    public static void main(String args[]) {
        // you are given a valid string i.e you will definitly have a closing
        // parentheses to an opening parenthese and vice versa
        String str = "((A+B)+(C+D) )";// false no duplicate
        String str2 = "(a+((b+c)))"; // true , duplicates exists

        System.out.print(duplicateDetector(str2));
    }

}
