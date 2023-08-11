package programmers.입문.day16;

public class 문자열_계산하기 {
    public static int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = 0;
        for (int i = 0; i < str.length; i += 2) {
            if (i == 0 || str[i - 1].equals("+")) {
                answer += Integer.parseInt(str[i]);
            }
            if (i > 0 && str[i - 1].equals("-")) {
                answer -= Integer.parseInt(str[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
    }
}
