package programmers.기초.day4;

import java.util.Scanner;

public class n의_배수 {
    static public int solution(int num, int n) {
        if (num % n == 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(solution(num, n));
    }
}
