package programmers.입문.day22;

public class 겹치는_선분의_길이 {
    public static int solution(int[][] lines) {
        int answer = 0;
        for (int i = -100; i < 100; i++) {
            int cnt = 0;
            if (lines[0][0] <= i && i < lines[0][1])
                cnt++;
            if (lines[1][0] <= i && i < lines[1][1])
                cnt++;
            if (lines[2][0] <= i && i < lines[2][1])
                cnt++;
            if (cnt > 1)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }
}
