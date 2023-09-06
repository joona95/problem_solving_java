package programmers.완전탐색;

public class 최소직사각형 {
    public static int solution(int[][] sizes) {
        int maxW = 0, maxH = 0;
        /*
        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
            if (Math.max(maxW, w) * Math.max(maxH, h) <= Math.max(maxW, h) * Math.max(maxH, w)) {
                maxW = Math.max(maxW, w);
                maxH = Math.max(maxH, h);
            } else {
                maxW = Math.max(maxW, h);
                maxH = Math.max(maxH, w);
            }
        }
         */
        for (int[] size : sizes) {
            maxW = Math.max(maxW, Math.max(size[0], size[1]));
            maxH = Math.max(maxH, Math.min(size[0], size[1]));
        }

        return maxW * maxH;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
}
