package programmers.기초.day11;

import java.util.Scanner;

public class 문자_개수_세기 {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                answer[c - 'A'] += 1;
            }
            if ('a' <= c && c <= 'z') {
                answer[26 + c - 'a'] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        for (int n : solution(my_string))
            System.out.println(n);
    }
}
