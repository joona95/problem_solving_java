package programmers.스택_큐;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격 {
    public static int[] solution(int[] prices) {
        /*
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }
        return answer;
         */
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        int[] answer = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.add(i);
        }
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = prices.length - 1 - idx;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }
}
