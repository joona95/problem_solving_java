package programmers.day3;

import java.util.Scanner;

public class 두_수의_연산값_비교하기 {
    static public int solution(int a, int b) {
        int result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int result2 = 2 * a * b;

        return Math.max(result1, result2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }
}
