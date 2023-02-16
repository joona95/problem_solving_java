package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem_8_송아지찾기_1_BFS {
    static int[] dist = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> queue = new LinkedList<>();

    static int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        queue.offer(s);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dist[j];
                    if (nx == e)
                        return level + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(BFS(s, e));
    }
}
