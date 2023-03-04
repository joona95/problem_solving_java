package DFS_BFS;

import java.util.Scanner;

public class Problem_6_순열_구하기 {
    static int[] pm, ch, arr;
    static int n, m;

    static void DFS(int level) {
        if (level == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[level] = arr[i];
                    DFS(level + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        DFS(0);
    }
}
