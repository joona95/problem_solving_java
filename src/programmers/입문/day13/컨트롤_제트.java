package programmers.입문.day13;

import java.util.Stack;

public class 컨트롤_제트 {
    public static int solution(String s) {
        String[] arr = s.split(" ");
        /*
        int answer = 0;
        int num = 0;
        for(String str : arr) {
            if (str.equals("Z")) {
                answer -= num;
            }
            else {
                num = Integer.parseInt(str);
                answer += num;
            }
        }
         */
        Stack<Integer> stack = new Stack<>();
        for (String str : arr) {
            if (str.equals("Z"))
                stack.pop();
            else
                stack.push(Integer.parseInt(str));
        }
        return stack.stream().mapToInt(i -> i).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }
}
