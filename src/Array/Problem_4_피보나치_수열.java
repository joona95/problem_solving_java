package Array;

import java.util.Scanner;

public class Problem_4_피보나치_수열 {
    /*
    static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer;
    }
    */

    static void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /*
        for (int num : solution(n)) {
            System.out.print(num + " ");
        }
         */
        solution(n);
    }
}
