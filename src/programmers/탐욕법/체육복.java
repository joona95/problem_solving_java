package programmers.탐욕법;

import java.util.Arrays;

public class 체육복 {

    public static int solution(int n, int[] lost, int[] reserve) {

        int[] students = new int[n + 1];

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int x : lost) {
            students[x]--;
        }

        for (int x : reserve) {
            students[x]++;
        }

        for (int x : lost) {
            if (students[x] == -1) {
                if (x - 1 > 0 && students[x - 1] == 1) {
                    students[x - 1]--;
                    students[x]++;
                } else if (x + 1 <= n && students[x + 1] == 1) {
                    students[x + 1]--;
                    students[x]++;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (students[i] >= 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
        System.out.println(solution(5, new int[]{4,2}, new int[]{3,5}));
    }
}
