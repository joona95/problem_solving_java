package Recursive_Tree_Graph;

import java.util.Scanner;

public class Problem_3_팩토리얼 {
    static int DFS(int n) {
        if (n == 1)
            return 1;
        return DFS(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(DFS(n));
    }
}
