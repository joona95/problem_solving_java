package programmers.기초.day15;

import java.util.Arrays;

public class _1로_만들기 {
    public static int getFunctionCnt(int v) {
        int cnt = 0;
        while(v != 1) {
            if (v %2 == 0)
                v /= 2;
            else
                v = (v -1) / 2;
            cnt++;
        }
        return cnt;
    }

    public static int solution(int[] num_list) {
        return Arrays.stream(num_list).map(num -> getFunctionCnt(num)).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14}));
    }
}
