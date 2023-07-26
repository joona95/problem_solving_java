package programmers.기초.day22;

import java.util.Arrays;

public class 배열의_원소_삭제하기 {
    public static int[] solution(int[] arr, int[] delete_list) {
        return Arrays.stream(arr).filter(num -> Arrays.stream(delete_list).noneMatch(delNum -> delNum == num)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43})));
    }
}
