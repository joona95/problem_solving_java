package programmers.day11;

import java.util.Arrays;

public class 글자_지우기 {
    public static String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < indices.length; i++) {
            sb.deleteCharAt(indices[i] - i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
