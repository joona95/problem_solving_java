package programmers.기초.day24;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_3 {
    public static int[] solution(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) {
                arr[i] += k;
            } else {
                arr[i] *= k;
            }
        }
        return arr;
        // return Arrays.stream(arr).map(operand -> k % 2 == 0 ? operand + k : operand * k).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 2)));
    }
}
