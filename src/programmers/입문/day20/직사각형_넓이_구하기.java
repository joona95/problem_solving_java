package programmers.입문.day20;

import java.util.Arrays;

public class 직사각형_넓이_구하기 {
    public static int solution(int[][] dots) {
        /*
        int minX = Arrays.stream(dots).mapToInt(dot -> dot[0]).min().getAsInt();
        int minY = Arrays.stream(dots).mapToInt(dot -> dot[1]).min().getAsInt();
        int maxX = Arrays.stream(dots).mapToInt(dot -> dot[0]).max().getAsInt();
        int maxY = Arrays.stream(dots).mapToInt(dot -> dot[1]).max().getAsInt();
         */
        int minX = 256;
        int maxX = -256;
        int minY = 256;
        int maxY = -256;
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }
        return Math.abs(maxX - minX) * Math.abs(maxY - minY);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }
}
