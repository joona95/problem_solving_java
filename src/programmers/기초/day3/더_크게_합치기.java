package programmers.기초.day3;

import java.util.Scanner;

public class 더_크게_합치기 {
    static public int solution(int a, int b) {
        int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int result2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        return Math.max(result1, result2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }
}
