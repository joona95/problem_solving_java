package DFS_BFS;

import java.util.Scanner;

public class Problem_7_조합수_메모이제이션 {
    static int[][] dy = new int[35][35];

    static int DFS(int n, int r) {
        if(dy[n][r] > 0)
            return dy[n][r];
        if(n==r || r==0)
            return 1;
        else
            return  dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println(DFS(n, r));
    }
}
