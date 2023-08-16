package programmers.입문.day22;

public class 저주의_숫자_3 {
    public static int solution(int n) {
        int cnt = 1;
        int answer = 0;
        while(cnt <= n) {
            answer++;
            if (answer % 3 != 0 && !String.valueOf(answer).contains("3")) {
                cnt++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }
}
