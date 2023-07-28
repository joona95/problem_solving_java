package programmers.입문.day3;

import java.util.HashMap;
import java.util.Map;

public class 최빈값_구하기 {
    public static int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int max = map.values().stream().mapToInt(i -> i).max().getAsInt();
        int answer = -1;
        for (int n : map.keySet()) {
            if (answer != -1 && map.get(n) == max) {
                answer = -1;
                break;
            }
            if (map.get(n) == max)
                answer = n;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[]{1, 1, 2, 2}));
        System.out.println(solution(new int[]{1}));
    }
}
