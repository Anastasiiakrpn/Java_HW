package lesson_2.valid_parenthese;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                brackets.push(c);
            } else {
                if (brackets.isEmpty()) return false;
                char top = brackets.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String Example1 = "()";
        System.out.println("Input: " + Example1 + " Output: " + solution.isValid(Example1)); // true

        String Example2 = "()[]{}";
        System.out.println("Input: " + Example2 + " Output: " + solution.isValid(Example2)); // true

        String Example3 = "(]";
        System.out.println("Input: " + Example3 + " Output: " + solution.isValid(Example3)); // false

        String Example4 = "([])";
        System.out.println("Input: " + Example4 + " Output: " + solution.isValid(Example4)); // true
    }
}


