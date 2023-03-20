package Greedy;

import java.util.Scanner;

public class Problem_6_친구인가_Union_Find {

    static int[] unf;

    static int find(int v) {
        if (v == unf[v])
            return v;
        else
            return unf[v] = find(unf[v]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }
        for (int i = 1; i <= m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            union(a, b);
        }
        int a = kb.nextInt();
        int b = kb.nextInt();
        int fa = find(a);
        int fb = find(b);
        if (fa == fb)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
