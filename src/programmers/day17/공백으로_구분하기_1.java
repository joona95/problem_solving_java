package programmers.day17;

import java.util.Arrays;

public class 공백으로_구분하기_1 {
    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
        System.out.println(Arrays.toString(solution("programmers")));
    }
}
