package programmers.완전탐색;

public class 피로도 {

    public static boolean[] visited;
    public static int answer = 0;

    public static void dfs(int x, int[][] dungeons, int hp) {
        for (int i = 0; i < dungeons.length; i++) {
            if (hp >= dungeons[i][0] && !visited[i]) {
                visited[i] = true;
                hp -= dungeons[i][1];
                dfs(x + 1, dungeons, hp);
                hp += dungeons[i][1];
                visited[i] = false;
            }
        }
        answer = Math.max(answer, x);
    }

    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, dungeons, k);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}
