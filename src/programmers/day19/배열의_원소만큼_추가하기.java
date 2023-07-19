package programmers.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열의_원소만큼_추가하기 {
    public static int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int x : arr) {
            for (int i = 0; i < x; i++) {
                answer.add(x);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();

        //return Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 6})));
        System.out.println(Arrays.toString(solution(new int[]{1})));
    }
}
