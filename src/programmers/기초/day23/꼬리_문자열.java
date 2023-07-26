package programmers.기초.day23;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 꼬리_문자열 {
    public static String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(str -> !str.contains(ex)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"abc", "def", "ghi"}, "ef"));
        System.out.println(solution(new String[]{"abc", "bbc", "cbc"}, "c"));
    }
}
