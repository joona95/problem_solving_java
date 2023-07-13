package programmers.day13;

import java.util.Arrays;

public class 순서_바꾸기 {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        for (int i = n; i < num_list.length; i++)
            answer[i - n] = num_list[i];
        for (int i = 0; i < n; i++)
            answer[i + num_list.length - n] = num_list[i];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 3)));
    }
}
