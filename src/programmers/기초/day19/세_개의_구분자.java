package programmers.기초.day19;

import java.util.Arrays;

public class 세_개의_구분자 {
    public static String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[abc]+")).filter(x -> !x.isEmpty()).toArray(String[]::new);
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("baconlettucetomato")));
        System.out.println(Arrays.toString(solution("abcd")));
        System.out.println(Arrays.toString(solution("cabab")));
    }
}
