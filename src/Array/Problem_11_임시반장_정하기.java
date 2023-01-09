package Array;

import java.util.Scanner;

public class Problem_11_임시반장_정하기 {
    static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) { // i!=j 안해도 똑같이 다 5개 더해지는 것이므로 굳이 필요없음
                        cnt++;
                        break;
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
                answer = i + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
