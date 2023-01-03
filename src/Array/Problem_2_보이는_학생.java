package Array;

import java.util.Scanner;

public class Problem_2_보이는_학생 {
    static int solution(int n, int[] arr) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                answer++;
                max = arr[i];
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
        int result = solution(n, arr);
        System.out.println(result);
    }
}
