package programmers.입문.day6;

public class 문자_반복_출력하기 {
    public static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }
}
