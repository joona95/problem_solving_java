package Array;

import java.util.Scanner;

public class Problem_8_등수구하기 {
    static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        /*
        int[] scores = new int[101];
        for (int i = 0; i < n; i++) {
            scores[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 100; j > arr[i]; j--) {
                sum += scores[j];
            }
            answer[i] = sum + 1;
        }
         */
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j])
                    cnt++;
            }
            answer[i] = cnt;
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
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
