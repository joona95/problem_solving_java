package programmers.기초.day15;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_2 {
    public static int solution(int[] arr) {
        int cnt = 0;
        int[] preArr;
        int[] nextArr = Arrays.copyOf(arr, arr.length);
        do {
            preArr = Arrays.copyOf(nextArr, nextArr.length);
            nextArr = Arrays.stream(preArr).map(i -> i >= 50 && i % 2 == 0 ? i / 2 : i < 50 && i % 2 != 0 ? i * 2 + 1 : i)
                    .toArray();
            cnt++;
        } while (!Arrays.equals(preArr, nextArr));

        return cnt - 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
    }
}
