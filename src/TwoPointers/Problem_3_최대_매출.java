package TwoPointers;

import java.util.Scanner;

public class Problem_3_최대_매출 {
    static int solution(int n, int k, int[] arr) {
        int answer = 0;
        /*
        int p1 = 0, p2 = 0, sum = 0;
        while (p2 < n) {
            if (p2 < k) {
                sum += arr[p2++];
            } else {
                sum = sum - arr[p1++] + arr[p2++];
            }
            if (sum > answer) {
                answer = sum;
            }
        }
         */
        int sum = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
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
