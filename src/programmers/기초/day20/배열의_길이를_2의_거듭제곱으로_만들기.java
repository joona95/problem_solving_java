package programmers.기초.day20;

import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public static int[] solution(int[] arr) {
        return Arrays.copyOf(arr, getMinPow(arr.length));
    }

    public static int getMinPow(int num) {
        int answer = 1;
        while (num > answer) { //1도 2^0으로 2의 거듭제곱에 속함
            answer *= 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
        System.out.println(Arrays.toString(solution(new int[]{1})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89, 58, 172, 746})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89, 58, 172, 746, 58, 172, 746, 89, 58, 172, 746})));
    }
}
