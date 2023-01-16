package TwoPointers;

import java.util.Scanner;

public class Problem_6_최대_길이_연속부분수열 {
    static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0)
                cnt++;
            while (cnt > k) {
                if (arr[lt] == 0)
                    cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
