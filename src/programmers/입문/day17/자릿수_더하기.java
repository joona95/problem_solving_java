package programmers.입문.day17;

public class 자릿수_더하기 {
    public static int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }
}
