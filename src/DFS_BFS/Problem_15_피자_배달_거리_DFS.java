package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_15_피자_배달_거리_DFS {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> pizza, houses;

    static void DFS(int level, int s) {
        if (level == m) {
            int sum = 0;
            for (Point h : houses) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pizza = new ArrayList<>();
        houses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = in.nextInt();
                if (tmp == 1) houses.add(new Point(i, j));
                else if (tmp == 2) pizza.add(new Point(i, j));
            }
        }
        len = pizza.size();
        combi = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }
}
