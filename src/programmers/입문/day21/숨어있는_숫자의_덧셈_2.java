package programmers.입문.day21;

public class 숨어있는_숫자의_덧셈_2 {

    public static int solution(String my_string) {
        String[] arr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        int answer = 0;
        for (String str : arr) {
            if (!str.isEmpty())
                answer += Integer.parseInt(str);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
        System.out.println(solution("abcdef"));
    }
}
