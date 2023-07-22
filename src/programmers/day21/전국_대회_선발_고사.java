package programmers.day21;

import java.util.Comparator;
import java.util.stream.IntStream;

public class 전국_대회_선발_고사 {

    public static int solution(int[] rank, boolean[] attendance) {
        /*
        int[] idx = new int[rank.length + 1];
        for (int i = 0; i < rank.length; i++) {
            idx[rank[i]] = i;
        }
        int answer = 0;
        int multiply = 10000;
        int cnt = 0;
        for (int i = 1; i <= rank.length; i++) {
            if (attendance[idx[i]]) {
                answer += multiply * idx[i];
                multiply /= 100;
                cnt++;
            }
            if (cnt >= 3)
                break;
        }
        return answer;

         */
        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3)
                .reduce((current, next) -> current * 100 + next)
                .get();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false}));
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{true, true, true}));
        System.out.println(solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true}));
    }
}
