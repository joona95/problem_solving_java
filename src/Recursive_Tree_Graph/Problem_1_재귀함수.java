package Recursive_Tree_Graph;

import java.util.Scanner;

public class Problem_1_재귀함수 {
    static void DFS(int n) {
        if (n == 0)
            return;
        else {
            DFS(n - 1);
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        DFS(n);
    }
}
