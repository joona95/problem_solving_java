package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Problem_4_후위식_연산 {
    static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.add(c - '0');
                continue;
            }

            int a = stack.pop();
            int b = stack.pop();
            if (c == '+') {
                stack.add(b + a);
            } else if (c == '-') {
                stack.add(b - a);
            } else if (c == '*') {
                stack.add(b * a);
            } else {
                stack.add(b / a);
            }
        }
        answer = stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
