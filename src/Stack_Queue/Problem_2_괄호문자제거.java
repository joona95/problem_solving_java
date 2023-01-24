package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Problem_2_괄호문자제거 {
    static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.add(c);
            if (c == ')') {
                char x = stack.pop();
                while (x != '(') {
                    x = stack.pop();
                }
                //while (stack.pop() != '(');
            }
        }
        for (char c : stack) {
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
