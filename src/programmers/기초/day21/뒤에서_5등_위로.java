package programmers.기초.day21;

import java.util.Arrays;

public class 뒤에서_5등_위로 {
    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
        //return Arrays.stream(num_list).sorted().skip(5).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
}
