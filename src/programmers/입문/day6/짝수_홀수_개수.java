package programmers.입문.day6;

import java.util.Arrays;

public class 짝수_홀수_개수 {
    public static int[] solution(int[] num_list) {
        int evenCnt = 0;
        int oddCnt = 0;
        for (int n : num_list) {
            if (n % 2 == 0)
                evenCnt++;
            else
                oddCnt++;
        }

        return new int[]{evenCnt, oddCnt};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 7})));
    }
}
