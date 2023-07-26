package programmers.기초.day20;

import java.util.Arrays;

public class 배열의_길이에_따라_다른_연산하기 {
    public static int[] solution(int[] arr, int n) {
        int start = 0;
        if (arr.length % 2 == 0) {
            start = 1;
        }
        for (int i = start; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{49, 12, 100, 276, 33}, 27)));
        System.out.println(Arrays.toString(solution(new int[]{444, 555, 666, 777}, 100)));
    }
}
