package programmers.완전탐색;

import java.util.Arrays;

public class 카펫 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        for (int height = 2; height <= Math.sqrt(area); height++) {
            if (area % height == 0) {
                int width = area / height;
                if (yellow == (height - 2) * (width - 2)) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }
}
