package programmers.기초.day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 그림_확대 {
    public static String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for(String line : picture) {
            StringBuilder sb = new StringBuilder();
            for(char c: line.toCharArray()) {
                sb.append(String.valueOf(c).repeat(Math.max(0, k)));
            }
            for (int i=0;i<k;i++) {
                answer.add(sb.toString());
            }
        }
        return answer.toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2)));
        System.out.println(Arrays.toString(solution(new String[]{"x.x", ".x.", "x.x"}, 3)));
    }
}
