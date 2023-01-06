package Array;

import java.util.Scanner;

public class Problem_7_점수계산 {
    static int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                score++;
                answer += score;
            } else {
                score = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
