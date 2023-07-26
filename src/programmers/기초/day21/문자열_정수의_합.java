package programmers.기초.day21;

public class 문자열_정수의_합 {
    public static int solution(String num_str) {
        int answer = 0;
        for (char c : num_str.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }
}
