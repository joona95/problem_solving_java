package Array;

import java.util.Scanner;

public class Problem_3_가위_바위_보 {
    static String solution(int n, int[] arrA, int[] arrB) {
        String answer = "";
        /*
        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i])
                answer += "D";
            else if (arrA[i] == 1 && arrB[i] == 3)
                answer += "A";
            else if (arrA[i] == 3 && arrB[i] == 1)
                answer += "B";
            else if (arrA[i] < arrB[i])
                answer += "B";
            else if (arrA[i] > arrB[i])
                answer += "A";
        }
         */
        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i])
                answer += "D";
            else if (arrA[i] == 1 && arrB[i] == 3)
                answer += "A";
            else if (arrA[i] == 2 && arrB[i] == 1)
                answer += "A";
            else if (arrA[i] == 3 && arrB[i] == 2)
                answer += "A";
            else
                answer += "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = in.nextInt();
        }
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrB[i] = in.nextInt();
        }
        for (char c : solution(n, arrA, arrB).toCharArray())
            System.out.println(c);
    }
}
