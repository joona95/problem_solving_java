package programmers.입문.day4;

public class 피자_나눠_먹기_1 {
    public static int solution(int n) {
        int answer = n / 7;
        if (n % 7 != 0)
            answer++;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }
}
