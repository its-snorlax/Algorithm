//https://leetcode.com/problems/evaluate-reverse-polish-notation/
package leetCode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                Integer number2 = stack.pop();
                Integer number1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(number1 + number2);
                        break;
                    case "-":
                        stack.push(number1 - number2);
                        break;
                    case "*":
                        stack.push(number1 * number2);
                        break;
                    case "/":
                        stack.push(number1 / number2);
                        break;
                }
            } else stack.push(Integer.parseInt(token));
        }
        return stack.peek();
    }
}
