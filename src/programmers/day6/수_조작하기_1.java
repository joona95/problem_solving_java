package programmers.day6;

import java.util.Scanner;

public class 수_조작하기_1 {
    static public int solution(int n, String control) {
        int answer = n;
        for (char c : control.toCharArray()) {
            if (c == 'w')
                answer++;
            if (c == 's')
                answer--;
            if (c == 'd')
                answer += 10;
            if (c == 'a')
                answer -= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String control = sc.next();

        System.out.println(solution(n, control));
    }
}
