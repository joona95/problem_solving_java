package programmers.day13;

import java.util.Arrays;

public class n_번째_원소부터 {
    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5}, 2)));
    }
}
