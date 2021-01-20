//https://leetcode.com/problems/valid-parentheses/
package leetCode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (!stack.isEmpty()) {
                    Character peek = stack.peek();
                    if (bracket == ')' && peek == '(')
                        stack.pop();
                    else if (bracket == '}' && peek == '{')
                        stack.pop();
                    else if (bracket == ']' && peek == '[')
                        stack.pop();
                    else return false;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
