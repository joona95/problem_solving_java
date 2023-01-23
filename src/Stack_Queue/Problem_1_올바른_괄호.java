package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Problem_1_올바른_괄호 {
    static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '(') {
                stack.add(c);
            }
            else {
                if(stack.isEmpty())
                    return "NO";
                stack.pop();
            }
        }
        if(stack.isEmpty())
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
