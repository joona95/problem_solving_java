package programmers.기초.day10;

import java.util.Scanner;

public class 세로_읽기 {
    public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int idx = c - 1;
        while (idx < my_string.length()) {
            sb.append(my_string.charAt(idx));
            idx += m;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        int m = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(solution(my_string, m, c));
    }
}
