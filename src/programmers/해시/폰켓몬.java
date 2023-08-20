package programmers.해시;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static int solution(int[] nums) {
        Set<Integer> ponketmon = new HashSet<>();
        for (int num : nums) {
            ponketmon.add(num);
        }
        return Math.min(nums.length / 2, ponketmon.size());
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}
