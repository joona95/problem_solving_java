package programmers.입문.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 소인수분해 {
    public static int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int idx = 2;
        while (n != 1) {
            if (n % idx == 0) {
                answer.add(idx);
                n /= idx;
            }
            else {
                idx++;
            }
        }
        return answer.stream().mapToInt(i -> i).distinct().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));
    }
}
