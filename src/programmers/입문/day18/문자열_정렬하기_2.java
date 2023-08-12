package programmers.입문.day18;

import java.util.Arrays;

public class 문자열_정렬하기_2 {
    public static String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }
}
