package programmers.day7;

import java.util.Stack;

public class 배열_만들기_4 {
    static public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        while (idx < arr.length) {
            if (stack.isEmpty() || arr[idx] > stack.peek()) {
                stack.add(arr[idx]);
                idx++;
                continue;
            }
            stack.pop();
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        for (int num : solution(arr)) {
            System.out.print(num);
        }
    }
}
