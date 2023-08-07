package programmers.입문.day13;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 중복된_문자_제거 {
    public static String solution(String my_string) {
        String[] arr = my_string.split("");
        return Arrays.stream(arr).distinct().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }
}
