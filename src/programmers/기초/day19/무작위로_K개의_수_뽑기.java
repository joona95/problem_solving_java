package programmers.기초.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 무작위로_K개의_수_뽑기 {
    public static int[] solution(int[] arr, int k) {
        List<Integer> nums = new ArrayList<>();
        for(int x : arr) {
            if(!nums.contains(x)) {
                nums.add(x);
            }
        }
        return IntStream.range(0, k).map(i -> i < nums.size() ? nums.get(i) : -1).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }
}
