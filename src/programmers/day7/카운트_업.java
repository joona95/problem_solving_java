package programmers.day7;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 카운트_업 {
    static public int[] solution(int start, int end) {
        /*
        int[] answer = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            answer[i - start] = i;
        }
        return answer;
         */
        return IntStream.rangeClosed(start, end).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i : solution(start, end))
            System.out.println(i);
    }
}
