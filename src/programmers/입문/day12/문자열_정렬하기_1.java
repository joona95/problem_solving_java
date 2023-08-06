package programmers.입문.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_정렬하기_1 {
    public static int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.add(c - '0');
            }
        }
        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }
}
