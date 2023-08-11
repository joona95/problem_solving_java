package programmers.입문.day16;

import java.util.Arrays;

public class 가장_큰_수_찾기 {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i=0;i<array.length;i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
        System.out.println(Arrays.toString(solution(new int[]{9, 10, 11, 8})));
    }
}
