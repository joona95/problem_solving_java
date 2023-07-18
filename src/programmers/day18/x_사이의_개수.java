package programmers.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class x_사이의_개수 {
    public static int[] solution(String myString) {
        /*
        List<Integer> answer = new ArrayList<>();
        int idx = -1;
        for (int i = 0;i < myString.length();i++) {
            if (myString.charAt(i) == 'x') {
                answer.add(i - idx - 1);
                idx = i;
            }
        }
        answer.add(myString.length() - idx - 1);
        return answer.stream().mapToInt(i -> i).toArray();
         */
        return Arrays.stream(myString.split("x", -1)).mapToInt(String::length).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("oxooxoxxox")));
        System.out.println(Arrays.toString(solution("xabcxdefxghi")));
    }
}
