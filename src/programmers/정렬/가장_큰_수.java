package programmers.정렬;

import java.util.Arrays;

public class 가장_큰_수 {
    public static String solution(int[] numbers) {

        String[] str = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str, (i, j) -> (j + i).compareTo(i + j));
        String answer = String.join("", str);
        return answer.charAt(0) == '0' ? "0" : answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
        System.out.println(solution(new int[]{0,0,0}));
    }
}
