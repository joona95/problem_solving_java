package programmers.day21;

public class 문자열을_정수로_변환하기 {
    public static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
        System.out.println(solution("10"));
        System.out.println(solution("8542"));
    }
}
