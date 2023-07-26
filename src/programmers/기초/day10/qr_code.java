package programmers.기초.day10;

import java.util.Scanner;

public class qr_code {
    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r)
                sb.append(code.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int r = sc.nextInt();
        String code = sc.next();
        System.out.println(solution(q, r, code));
    }
}
