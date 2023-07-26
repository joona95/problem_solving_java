package programmers.기초.day25;

public class 정수를_나선형으로_배치하기 {
    public static int[][] solution(int n) {
        int[][] direct = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] answer = new int[n][n];
        int x = 0, y = 0, idx = 0;
        for (int i = 1; i <= n * n; i++) {
            answer[x][y] = i;
            int nx = x + direct[idx % 4][0];
            int ny = y + direct[idx % 4][1];
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || answer[nx][ny] != 0) {
                idx = (idx + 1) % 4;
                nx = x + direct[idx][0];
                ny = y + direct[idx][1];
            }
            x = nx;
            y = ny;
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int[] arr : solution(4)) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
