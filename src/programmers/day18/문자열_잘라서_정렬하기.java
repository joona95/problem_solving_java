package programmers.day18;

import java.util.Arrays;

public class 문자열_잘라서_정렬하기 {
    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(x -> !x.isEmpty()).sorted().toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("axbxxxcxdx")));
        System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
    }

}
