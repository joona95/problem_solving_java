package Recursive_Tree_Graph;

import java.util.Scanner;

public class Problem_6_부분집합_구하기_DFS {
    static int n;
    static int[] ch;

    static void DFS(int len) {
        if (len == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            ch[len] = 1;
            DFS(len + 1);
            ch[len] = 0;
            DFS(len + 1);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ch = new int[n + 1];
        DFS(1);
    }
}
