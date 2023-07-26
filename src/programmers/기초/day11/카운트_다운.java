package programmers.기초.day11;

import java.util.Scanner;

public class 카운트_다운 {
    public static int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        for (int i = 0; i <= start - end; i++) {
            answer[i] = start - i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int num : solution(start, end))
            System.out.println(num);
    }
}
