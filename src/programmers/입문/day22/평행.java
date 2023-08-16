package programmers.입문.day22;

public class 평행 {
    public static int solution(int[][] dots) {
        if ((double) (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]) == (double) (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]))
            return 1;
        if ((double) (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]) == (double) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]))
            return 1;
        if ((double) (dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]) == (double) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]))
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
        System.out.println(solution(new int[][]{{3, 5}, {4, 4}, {8, 9}, {6, 11}}));
    }
}