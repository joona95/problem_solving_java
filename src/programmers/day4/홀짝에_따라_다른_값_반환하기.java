package programmers.day4;

import java.util.Scanner;

public class 홀짝에_따라_다른_값_반환하기 {
    static public int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                answer += Math.pow(i, 2);
            }
            return answer;
        }

        for (int i = 1; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
