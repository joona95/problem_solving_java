package programmers.스택_큐;

import java.util.Stack;

public class 올바른_괄호 {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack();
        boolean answer = true;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty())
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
    }
}
